package com.restspring.restapis.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.restspring.restapis.entities.Fruits;
import com.restspring.restapis.service.FruitService;

@RestController
public class appController {
	
	@Autowired
	private FruitService fruitService;
	
	@GetMapping("/home")
	public String hPage() {
		return "This is Home Page";
	}
	
	@GetMapping("/fruits")
	public List<Fruits> getFruits()
	{
		return this.fruitService.getFruits();
	}
	
	@GetMapping("/fruits/{fruitId}")
	public Fruits getFruit(@PathVariable String fruitId)
	{
		return this.fruitService.getFruit(Long.parseLong(fruitId));
	}
}
