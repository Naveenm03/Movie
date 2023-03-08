package com.movied.movieworkshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Map;
import java.util.Optional;

@RestController
@CrossOrigin
public class ReviewControler {
	@Autowired
	private ReviewService revservice;
	
	@PostMapping("/addreview")
	public Review postDetails(@RequestBody Review s)
	{
		return  revservice.saveDetails(s);
		
		
	}
	@DeleteMapping("/deleterev/{revid}")
	 public String deleteReview(@PathVariable("revid")int revid) {
		 revservice.deletedata(revid);
		 return "deleted";
	 }
	@DeleteMapping("/deletereview/{reviews}")
	 public String deleteReviewByDesig(@PathVariable("reviews")String reviews) {
		 revservice.deleteReviewByDesig(reviews);
		 return "deleted";
	 }
	
	
}
