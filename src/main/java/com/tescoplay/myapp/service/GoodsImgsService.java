package com.tescoplay.myapp.service;


import com.tescoplay.myapp.entity.GoodsImages;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsImgsService extends JpaRepository<GoodsImages, Integer> {
    @Query("select g.imagePath from GoodsImages g where g.goodsId=?1")
    List<String> findByGoodsId(Long goodsId);
}
