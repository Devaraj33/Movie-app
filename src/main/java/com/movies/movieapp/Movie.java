package com.movies.movieapp;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;


//   @Data
   @Entity
   @Table(name="movies")
    public class Movie {
	
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer id;
	
	@Column(name="movie_id")
	private String movie_id;
	
	@Column(name="movie_name")
	private String movie_name;
	
	@Column(name="movie_collection")
	private BigDecimal movie_collection;
	
	public Movie() {}
	

	


	public Movie(Integer id, String movie_id, String movie_name, BigDecimal movie_collection) {
		super();
		this.id = id;
		this.movie_id = movie_id;
		this.movie_name = movie_name;
		this.movie_collection = movie_collection;
	}





	public Integer getId() {
		return id;
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getMovie_name() {
		return movie_name;
	}


	public void setMovie_name(String movie_name) {
		this.movie_name = movie_name;
	}


	public BigDecimal getMovie_collection() {
		return movie_collection;
	}


	public void setMovie_collection(BigDecimal movie_collection) {
		this.movie_collection = movie_collection;
	}


	public String getMovie_id() {
		return movie_id;
	}





	public void setMovie_id(String movie_id) {
		this.movie_id = movie_id;
	}





	@Override
	public String toString() {
		return "Movie [id=" + id + ", movie_id=" + movie_id + ", movie_name=" + movie_name + ", movie_collection="
				+ movie_collection + "]";
	}

}
   
