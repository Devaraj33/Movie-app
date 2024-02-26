package com.movies.movieapp.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.movies.movieapp.Movie;
import com.movies.movieapp.Service.MovieService;

@RestController
@RequestMapping("/movies")
public class MovieController {
	
	@Autowired
	MovieService movieService;
	
    @GetMapping("/MovieName")
    public List<Movie> getAllMovies() {
         return movieService.getAllMovies();
    }
    @PostMapping("/AddMovie")
    public Movie addMovie(@RequestBody Movie movie) {

    	try {
        return movieService.addMovies(movie);
   
    	}catch(Exception e) {
    	e.printStackTrace();	
    	}
    	return null;
    	}
    
    
    @GetMapping("/getByMoviename")
    public List<Movie> getByMovieName(@RequestParam("movie") String name) {
         return movieService.getMovieByName(name);
    }
    
    
    @GetMapping("/getByMovieCollection")
    public List<Movie> getByMovieCollection(@RequestParam("from") int from, @RequestParam("to") int to) {
         return movieService.getMovieByCollection(from, to);
    }
}
