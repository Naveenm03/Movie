package com.movied.movieworkshop;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

@Service
public class ReviewService {
    @Autowired
    private ReviewRepository repo;

    

    public Review saveDetails(Review s)
	{
		return repo.save(s);
	}
    public void deletedata(int reviews) {
		repo.deleteById(reviews);
	}
public void deleteReviewByDesig(String reviews) {
		repo.deleteReviewByDesig(reviews);
		
		
	}



	



	
    
	
}
