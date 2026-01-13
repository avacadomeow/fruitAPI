package com.restspring.restapis.service;

import java.util.List;

import com.restspring.restapis.entities.Fruits;

public interface FruitService {
	
	public List<Fruits> getFruits();
	public Fruits getFruit(long fruitId);

}
