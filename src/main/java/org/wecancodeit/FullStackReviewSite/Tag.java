package org.wecancodeit.FullStackReviewSite;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Tag {

	@ManyToMany
	private Collection<Review> reviews;
	
	@Id
	@GeneratedValue
	private Long id;
	private String actorName;
	
	public Tag() {}
	
	public Tag(String actorName, Review...reviews) {
		this.actorName = actorName;
		this.reviews = Arrays.asList(reviews);
	}

	public Collection<Review> getReviews() {
		return reviews;
	}

	public Long getId() {
		return id;
	}

	public String getActorName() {
		return actorName;
	}
	
	
	
}
