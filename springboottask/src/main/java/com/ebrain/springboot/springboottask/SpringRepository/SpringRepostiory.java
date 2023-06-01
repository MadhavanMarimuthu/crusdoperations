package com.ebrain.springboot.springboottask.SpringRepository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.ebrain.springboot.springboottask.SpringEntity.SpringEntity;

@Repository
public interface SpringRepostiory extends  CrudRepository<SpringEntity ,Integer > {



	
	
}
