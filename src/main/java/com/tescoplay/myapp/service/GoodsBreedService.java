package com.tescoplay.myapp.service;


import com.tescoplay.myapp.entity.GoodsBreed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsBreedService extends JpaRepository<GoodsBreed, Integer> {
	List<GoodsBreed> findAll();
	@Query("from GoodsBreed g where g.isActive = 'Y'")
	List<GoodsBreed> findByActive();
}
