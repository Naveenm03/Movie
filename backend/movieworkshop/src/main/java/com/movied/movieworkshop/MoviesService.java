package com.movied.movieworkshop;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


@Service
public class MoviesService {

	@Autowired
	private MoviesRepo stu;
	
	public Movies saveDetails(Movies s)
	{
		return stu.save(s);
	}
	
	
	public List<Movies> getAllDetails()
	{
		return stu.findAll();
	}
	public List<Movies> getDetails(int pgno,
	int pgsize){
		
		Pageable pg=PageRequest.of(pgno, pgsize);
		Page<Movies> pagedResult = stu.findAll(pg);
		List<Movies> products=pagedResult.getContent();
		return products;
	}
	public void deletedata(int id) {
		stu.deleteById(id);
	}
	public Movies updatedata(Movies s) {
		return stu.saveAndFlush(s);
	}
}