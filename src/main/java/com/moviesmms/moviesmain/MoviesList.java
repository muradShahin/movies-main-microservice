package com.moviesmms.moviesmain;

import java.util.List;

public class MoviesList {
	
	
	private List<Movie> movies;
	private String ec2_metadataString;


	public String getEc2_metadataString() {
		return ec2_metadataString;
	}

	public void setEc2_metadataString(String ec2_metadataString) {
		this.ec2_metadataString = ec2_metadataString;
	}

	public MoviesList(List<Movie> movies,String ec2_metadataString) {
		super();
		this.movies = movies;
		this.ec2_metadataString=ec2_metadataString;
	}

	public MoviesList() {
		super();
	}

	public List<Movie> getMovies() {
		return movies;
	}

	public void setMovies(List<Movie> movies) {
		this.movies = movies;
	}
	
	
	
	

}
