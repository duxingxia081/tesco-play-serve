package com.tescoplay.myapp.service;


import com.tescoplay.myapp.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsService extends JpaRepository<Goods, Integer> {
	List<Goods> findAll();
}
