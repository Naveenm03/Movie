package com.movied.movieworkshop;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;

@Repository
public interface ReviewRepository extends JpaRepository<Review, Integer> {

@Transactional
	@Modifying
	@Query("delete from Review e where e.reviews=:reviews")
	void deleteReviewByDesig(@Param("reviews")String reviews);




	
}
