package org.wecancodeit.FullStackReviewSite;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity
public class Category {
	@OneToMany
	private Collection<Review> reviews;
	@Id
	@GeneratedValue
	
	private Long id;
	private String title;
	
	public Category() {}
	
	
	
	public Category(String title, Review...reviews ) {
		
		this.reviews = Arrays.asList(reviews);
		this.id = id;
		this.title = title;
	}



	public Collection<Review> getReviews() {
		return reviews;
	}
	@Override
	public String toString() {
		return "This is a " + title + " movie.";
	}



	public Long getId() {
		return id;
	}
	public String getTitle() {
		return title;
	}
	
	
	
		
	
}
