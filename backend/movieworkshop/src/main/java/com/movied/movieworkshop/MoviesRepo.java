package com.movied.movieworkshop;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface MoviesRepo extends JpaRepository<Movies,Integer> {

	List<String> save(List<String> s);


	

}
