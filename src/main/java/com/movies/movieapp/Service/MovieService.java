package com.movies.movieapp.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.movies.movieapp.Movie;
import com.movies.movieapp.dao.MovieDao;

@Service
public class MovieService {
	
	@Autowired
	MovieDao movieDao;
	
	public List<Movie> getAllMovies() {
		return movieDao.findAll();
		
	}
	
	public Movie addMovies(Movie movie) {
		return movieDao.save(movie);
		
	}
	
	public List<Movie> getMovieByName(String movieName) {
		return movieDao.findByMovie_name(movieName);
		
	}
	
	public List<Movie> getMovieByCollection(int from, int to) {
		return movieDao.findBymovie_collection(from, to);
		
	}
	

}
