package com.movied.movieworkshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


@RestController
@CrossOrigin
public class MoviesController {
	@Autowired
	private MoviesService movservice;
	
	@PostMapping("/addMovies")
	public Movies postDetails(@RequestBody Movies s)
	{
		return  movservice.saveDetails(s);
		
		
	}
	

	
	@GetMapping("/findall/{pgno}/{pgsize}")
	 public List<Movies> listing(@PathVariable("pgno")int pgno,@PathVariable("pgsize")int pgsize) {
	 	 return  movservice.getDetails(pgno,pgsize);
	 	
	  }
	@GetMapping("/getMovies")
	public List<Movies> getDetails()
	{
		
		return movservice.getAllDetails();
	}
	@PutMapping("/update")
	 public String updateMovies(@RequestBody Movies s) {
		  movservice.updatedata(s);
		  return "updated";
	 }
	 @DeleteMapping("/delete/{id}")
	 public String deleteMovies(@PathVariable("id")int id) {
		 movservice.deletedata(id);
		 return "deleted";
	 }
}
