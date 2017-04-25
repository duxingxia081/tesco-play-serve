package com.tescoplay.myapp.service;


import com.tescoplay.myapp.entity.GoodsEvaluate;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsEvaluateService extends JpaRepository<GoodsEvaluate, Integer> {
    List<GoodsEvaluate> findAll();

    @Query("select count(g) from GoodsEvaluate g where g.goodsId=?1")
    int count(Long goodsId);

    @Query("from GoodsEvaluate g where g.goodsId=?1")
    List<GoodsEvaluate> listByGoodsId(Long goodsId);
}
