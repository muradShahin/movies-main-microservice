package com.moviesmms.moviesmain;

import java.util.ArrayList;
import java.util.List;

import org.springframework.boot.jackson.JsonObjectDeserializer;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

//MOVEIS-FACTORY_SERVICE_HOST for GCP services
//@FeignClient(name ="movies-factory",url="${MOVEIS-FACTORY_SERVICE_HOST:http://localhost}:8000")

@FeignClient(name ="movies-factory",url="${MOVEIS-FACTORY_SERVICE_HOST:http://localhost:8000}")
public interface MoviesProxy {
	
	@GetMapping("/movies-factory/get2")
	Object movies();
	

	@GetMapping("/movies-factory/get2")
	MoviesList movies2();
	
	@GetMapping("movies-factory/movie/{id}")
	Movie movie(@PathVariable int id);
	
	
}
