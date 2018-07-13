package org.wecancodeit.FullStackReviewSite;

import java.util.Arrays;
import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class ActorTag {

	@ManyToMany
	private Collection<Review> reviews;
	
	@Id
	@GeneratedValue
	private Long id;
	private String actorName;
	
	public ActorTag() {}
	
	public ActorTag(String actorName, Review...reviews) {
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
