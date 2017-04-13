package com.tescoplay.myapp.service;


import com.tescoplay.myapp.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsService extends JpaRepository<Goods, Integer> {
	List<Goods> findAll();
	@Query("from Goods g where g.isActive = 'Y'")
	List<Goods> findByActive();
}
