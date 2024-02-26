package com.movies.movieapp.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.movies.movieapp.Movie;

@Repository
public interface MovieDao extends JpaRepository<Movie, Integer> {
	
	
	@Query(value="SELECT * FROM movie where movie_name =:movie_name", nativeQuery=true)
	public List<Movie> findByMovie_name(@Param("movie_name") String movie);
	
	@Query(value="SELECT * FROM movie where movie_collection >=:from and movie_collection <=:to", nativeQuery=true)
	public List<Movie> findBymovie_collection(@Param("from") int from, @Param("to") int to);
 
}
