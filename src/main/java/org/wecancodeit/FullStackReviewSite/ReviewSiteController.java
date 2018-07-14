package org.wecancodeit.FullStackReviewSite;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ReviewSiteController {

	@Autowired
	ReviewRepository reviewRepo;
	@Autowired
	CommentRepository commentRepo;
	@Autowired
	CategoryRepository categoryRepo;
	@Autowired
	TagRepository tagRepo;

	@RequestMapping("/reviews")
	public String getReview(Model model) {
		model.addAttribute("reviews", reviewRepo.findAll());
		return "reviews";

	}

	@RequestMapping("/reviews/{id}")
	public String getReview(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("review", reviewRepo.findOne(id));
		return "review";

	}

	@RequestMapping("/categories")
	public String getCategory(Model model) {
		model.addAttribute("categories", categoryRepo.findAll());
		return "categories";
	}

	@RequestMapping("/categories/{id}")
	public String getCategory(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("category", categoryRepo.findOne(id));
		return "category";

	}

	@RequestMapping(value = "/reviews/{id}", method = RequestMethod.POST)
	public String addComment(@PathVariable(name = "id") Long id, String comment) {
		commentRepo.save(new Comment(comment, reviewRepo.findOne(id)));
		return "redirect:/reviews/{id}";
	}

	@RequestMapping("/tags")
	public String getActors(Model model) {
		model.addAttribute("tags", tagRepo.findAll());
		return "tags";
	}

	@RequestMapping("/tags/{id}")
	public String getActor(@PathVariable(name = "id") Long id, Model model) {
		model.addAttribute("tag", tagRepo.findOne(id));
		return "tag";

	}

}
