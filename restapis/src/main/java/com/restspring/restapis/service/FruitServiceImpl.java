package com.restspring.restapis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.restspring.restapis.entities.Fruits;

@Service
public class FruitServiceImpl implements FruitService {
	
	List<Fruits> list;
	public FruitServiceImpl() {
		list = new ArrayList<>();
		list.add(new Fruits(113, "Banana", "First fruit"));
		list.add(new Fruits(114, "Apple", "Second fruit"));
		list.add(new Fruits(115, "Orange", "Third fruit"));
	}

	@Override
	public List<Fruits> getFruits() {
		return list;
	}

	@Override
	public Fruits getFruit(long fruitId) {
		Fruits f = null;
		for(Fruits fruits:list)
		{
			if(fruits.getId()==fruitId)
			{
				f = fruits;
				break;
			}
		}
		return f;
	}

}
