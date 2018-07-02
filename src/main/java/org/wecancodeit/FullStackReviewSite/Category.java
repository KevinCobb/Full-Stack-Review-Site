package org.wecancodeit.FullStackReviewSite;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@OneToMany(mappedBy = "category")
	private Collection<Review> reviews;
	@ManyToOne
	private Category category;
	@Id
	@GeneratedValue

	private Long id;
	private String title;
	private String description;

	public Category() {
	}

	public Category(String title, String description, Review... reviews) {
		this.description = description;
		this.reviews = Arrays.asList(reviews);
		this.title = title;
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	@Override
	public String toString() {
		return "Category [reviews=" + reviews + ", id=" + id + ", title=" + title + ", description=" + description
				+ "]";
	}

	public Long getId() {
		return id;
	}

	public String getTitle() {
		return title;
	}

	public String getDescription() {
		return description;
	}

}
