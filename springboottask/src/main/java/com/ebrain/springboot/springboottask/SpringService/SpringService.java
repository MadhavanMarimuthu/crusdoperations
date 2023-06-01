package com.ebrain.springboot.springboottask.SpringService;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ebrain.springboot.springboottask.SpringEntity.SpringEntity;
import com.ebrain.springboot.springboottask.SpringRepository.SpringRepostiory;
@Service
public class SpringService {
	
	@Autowired
	private SpringRepostiory springRepostiory;
	
	public void post(SpringEntity entityobj) {
		springRepostiory.save(entityobj);
		
	}
	public void put( SpringEntity entityobj) {
		
		springRepostiory.save(entityobj);
		
	}
	public void deleteById(Integer id) {

		springRepostiory.deleteById(id);
	}
	public Iterable<SpringEntity> findAll() {
		
		return springRepostiory.findAll();
	}
	public Optional<SpringEntity> findById(Integer id) {
		return springRepostiory.findById(id);
		
	}

}
