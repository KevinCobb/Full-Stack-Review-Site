package org.wecancodeit.FullStackReviewSite;

import java.util.Collection;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToOne;

@Entity
public class Review {
	@ManyToOne
	private Category category;
	@Id
	@GeneratedValue
	private Long id;
	private String name;
	@Lob
	private String description;
	private String imgUrl;
	
	
	public Review ( ) {}

	

	public Review(String name, String description, String imgUrl, Category category) {
		
		this.category = category;
		this.name = name;
		this.description = description;
		this.imgUrl = imgUrl;
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