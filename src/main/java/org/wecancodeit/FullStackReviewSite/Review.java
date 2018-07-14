package org.wecancodeit.FullStackReviewSite;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Review {
	@ManyToOne
	private Category category;
	@ManyToMany(mappedBy = "reviews")
	private Collection<Tag> tags;

	@OneToMany(mappedBy = "review")
	private Collection<Comment> comments;

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@Lob
	private String description;
	private String imgUrl;

	public Review() {
	}

	public Review(String name, String description, String imgUrl, Category category) {

		this.category = category;
		this.name = name;
		this.description = description;
		this.imgUrl = imgUrl;
	}

	public Collection<Tag> getTags() {
		return tags;
	}

	public Collection<Comment> getComments() {
		return comments;
	}

	public void addComment(Comment comment) {
		comments.add(comment);

	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public String getImgUrl() {
		return imgUrl;
	}

	public Category getCategory() {
		return category;
	}

	public Long getId() {
		return id;
	}

}