package com.tescoplay.myapp.service;


import com.tescoplay.myapp.entity.GoodsImages;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface GoodsImagesService extends JpaRepository<GoodsImages, Integer> {
	List<GoodsImages> findAll();
}
