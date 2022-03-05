package com.moviesmms.moviesmain;

import java.util.HashMap;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.amazonaws.xray.spring.aop.XRayEnabled;

@RestController
@XRayEnabled
public class MainController {

	
	@Autowired
	MoviesProxy moviesProxy;
	
	
	
	@GetMapping("/home-movies/get-all")
	public ResponseEntity<Object> fetchMovies(){
		
		 Object list = moviesProxy.movies();
		
	    return new ResponseEntity<Object>(list,HttpStatus.ACCEPTED);
		
	}
	
	@GetMapping("/home-movies/get-all2")
	public ResponseEntity<MoviesList> fetchMovies2(){
		
		MoviesList list = moviesProxy.movies2();
		
	    return new ResponseEntity<MoviesList>(list,HttpStatus.ACCEPTED);
		
	}
	
	
	

	
	@GetMapping("/home-movies/get/{id}")
	public ResponseEntity<Movie> fetchMovie(@PathVariable int id){
		
		//List<Movie> moviesList= moviesProxy.movies(page);
		
		//return new ResponseEntity<Object>(moviesProxy.movies(page),HttpStatus.ACCEPTED);
		
		Movie movie=moviesProxy.movie(id);
		
	    return new ResponseEntity<Movie>(movie,HttpStatus.ACCEPTED);
	}
	
	@GetMapping("/home-movies/get")
	public ResponseEntity<Movie> fetchMovieTest(){
		
		//List<Movie> moviesList= moviesProxy.movies(page);
		
		//return new ResponseEntity<Object>(moviesProxy.movies(page),HttpStatus.ACCEPTED);
		
		Movie movie=moviesProxy.movie(1004);
		
	    return new ResponseEntity<Movie>(movie,HttpStatus.OK);
	}
	
	
	@GetMapping("/")
	public ResponseEntity<String>initService(){
	
		 return new ResponseEntity<String>("Hi , Welcome to the Movies Back-End",HttpStatus.OK);
	}
		
	
}
