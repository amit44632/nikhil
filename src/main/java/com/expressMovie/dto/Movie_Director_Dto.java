package com.expressMovie.dto;

public class Movie_Director_Dto {
	
private Integer movie_director_id;
	
	private Integer director_id;
	
	private Integer movie_id;

	public Integer getMovie_director_id() {
		return movie_director_id;
	}

	public void setMovie_director_id(Integer movie_director_id) {
		this.movie_director_id = movie_director_id;
	}

	public Integer getDirector_id() {
		return director_id;
	}

	public void setDirector_id(Integer director_id) {
		this.director_id = director_id;
	}

	public Integer getMovie_id() {
		return movie_id;
	}

	public void setMovie_id(Integer movie_id) {
		this.movie_id = movie_id;
	}

	@Override
	public String toString() {
		return "Movie_Director_Dto [movie_director_id=" + movie_director_id + ", director_id=" + director_id
				+ ", movie_id=" + movie_id + "]";
	}
	
	
}
