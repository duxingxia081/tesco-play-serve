package com.tescoplay.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class Goods implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long goodsId;

	@Column(nullable = false)
	private Long goodsTypeId;

	@Column(nullable = false)
	private String goodsName;

	@Column(nullable = false)
	private String goodsDesc;

	@Column(nullable = false)
	private Float money;

	@Column(nullable = false)
	private String firstImage;

	@Column(nullable = false)
	private String isActive;

	@Column(nullable = false)
	private String goodsLevel;

	@Column(nullable = false)
	private Integer goodsPoints;

	@Column(nullable = true)
	private String isTopGoods;
	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Long getGoodsTypeId() {
		return goodsTypeId;
	}

	public void setGoodsTypeId(Long goodsTypeId) {
		this.goodsTypeId = goodsTypeId;
	}

	public String getGoodsName() {
		return goodsName;
	}

	public void setGoodsName(String goodsName) {
		this.goodsName = goodsName;
	}

	public String getGoodsDesc() {
		return goodsDesc;
	}

	public void setGoodsDesc(String goodsDesc) {
		this.goodsDesc = goodsDesc;
	}

	public Float getMoney() {
		return money;
	}

	public void setMoney(Float money) {
		this.money = money;
	}

	public String getFirstImage() {
		return firstImage;
	}

	public void setFirstImage(String firstImage) {
		this.firstImage = firstImage;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}

	public String getGoodsLevel() {
		return goodsLevel;
	}

	public void setGoodsLevel(String goodsLevel) {
		this.goodsLevel = goodsLevel;
	}

	public Integer getGoodsPoints() {
		return goodsPoints;
	}

	public void setGoodsPoints(Integer goodsPoints) {
		this.goodsPoints = goodsPoints;
	}

	public String getIsTopGoods() {
		return isTopGoods;
	}

	public void setIsTopGoods(String isTopGoods) {
		this.isTopGoods = isTopGoods;
	}
}
