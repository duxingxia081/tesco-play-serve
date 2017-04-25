package com.tescoplay.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class GoodsBreed implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long goodsBreedId;

	@Column(nullable = false)
	private Long goodsId;

	@Column(nullable = false)
	private String goodsBreed;

	@Column(nullable = false)
	private String isActive;

	public Long getGoodsBreedId() {
		return goodsBreedId;
	}

	public void setGoodsBreedId(Long goodsBreedId) {
		this.goodsBreedId = goodsBreedId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoodsBreed() {
		return goodsBreed;
	}

	public void setGoodsBreed(String goodsBreed) {
		this.goodsBreed = goodsBreed;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
}
