package com.moviesmms.moviesmain;


import java.math.BigDecimal;

import javax.persistence.Entity;


public class Movie {
	

    public long id;
    public String title;
    public String imageUri;
    public String description;
    public BigDecimal rate;
	

	public Movie() {
		super();
	};
	
	public Movie(long id, String title, String imageUri, String description, BigDecimal rate) {
		super();
		this.id = id;
		this.title = title;
		this.imageUri = imageUri;
		this.description = description;
		this.rate = rate;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getImageUri() {
		return imageUri;
	}

	public void setImageUri(String imageUri) {
		this.imageUri = imageUri;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public BigDecimal getRate() {
		return rate;
	}

	public void setRate(BigDecimal rate) {
		this.rate = rate;
	};
	
	

}
