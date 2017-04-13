package com.tescoplay.myapp.service;


import com.tescoplay.myapp.entity.Goods;
import com.tescoplay.myapp.entity.GoodsType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

public interface GoodsTypeService extends JpaRepository<GoodsType, Integer> {
	List<GoodsType> findAll();
	@Query("from GoodsType g where g.isActive = 'Y'")
	List<GoodsType> findByActive();
	@Query("UPDATE GoodsType gt SET gt.title=?2 WHERE gt.title=?1")
	@Modifying
	@Transactional
	void updateTitle(String oldTitle, String newTitle);

	@Query("DELETE FROM GoodsType gt WHERE gt.title=?1")
	@Modifying
	@Transactional
	void deleteByTitle(String title);
}
