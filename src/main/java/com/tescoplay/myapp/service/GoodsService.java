package com.tescoplay.myapp.service;


import com.tescoplay.myapp.entity.Goods;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface GoodsService extends JpaRepository<Goods, Integer> {
    List<Goods> findAll();

    @Query("from Goods g where g.isActive = 'Y'")
    List<Goods> findByActive();

    @Query("select new com.tescoplay.myapp.entity.Goods(g.goodsId,g.goodsTypeId,g.goodsName,g.goodsDesc,g.money,g.firstImage,g.goodsLevel,g.goodsPoints,(select sum(ug.buyNum) from UserGoods ug where ug.isActive='Y' and ug.goodsId=g.goodsId)) from Goods g where g.isActive = 'Y'")
    List<Goods> listByActive();
}
