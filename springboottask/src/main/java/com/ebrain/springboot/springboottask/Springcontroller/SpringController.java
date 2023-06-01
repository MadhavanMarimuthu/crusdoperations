package com.ebrain.springboot.springboottask.Springcontroller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.GetExchange;

import com.ebrain.springboot.springboottask.SpringEntity.SpringEntity;
import com.ebrain.springboot.springboottask.SpringService.SpringService;

@RestController
@RequestMapping("/LoginController")
public class SpringController {
	
	@Autowired
	private SpringService springService;
	@PostMapping("/post")
	public void post(@RequestBody SpringEntity Entityobj ) {
		springService.post(Entityobj);
	}
	
	@PutMapping(value ="/get")
	public SpringEntity  update(@RequestBody SpringEntity Entityobj) {
		springService.put(Entityobj);
		return Entityobj;
	}
	@DeleteMapping("/Delete/{id}")
	public void delete(@PathVariable Integer id ) {
		springService.deleteById(id);
}
	@GetMapping("/findAll")
	public Iterable<SpringEntity> findAll( ) {
		
		return springService.findAll();
}
	@GetMapping("/findById/{id}")
	public Optional<SpringEntity>findById(@PathVariable Integer id ) {
		
		return springService.findById(id);
}
}
