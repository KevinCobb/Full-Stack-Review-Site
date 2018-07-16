package org.wecancodeit.FullStackReviewSite;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Comment {

	@ManyToOne
	private Review review;

	@Id
	@GeneratedValue
	private Long id;
	@Lob
	private String comment;

	public Comment() {
	}

	public Comment(String comment, Review review) {
		this.comment = comment;
		this.review = review;
	}

	public Review getReview() {
		return review;
	}

	public Long getId() {
		return id;
	}

	public String getComment() {
		return comment;
	}

	@Override
	public String toString() {
		return comment;
	}

}
