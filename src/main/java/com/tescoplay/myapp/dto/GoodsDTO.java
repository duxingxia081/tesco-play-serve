package com.tescoplay.myapp.dto;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

public class GoodsDTO{
	private Long goodsId;

	private Long goodsTypeId;

	private String goodsName;

	private String goodsDesc;

	private Float money;

	private String firstImage;

	private String isActive;

	private String goodsLevel;

	private Integer goodsPoints;

	private Long userBuyNum;

	private String isTopGoods;
	public GoodsDTO(){}
	public GoodsDTO(Long goodsId, Long goodsTypeId, String goodsName, String goodsDesc, Float money, String firstImage, String goodsLevel, Integer goodsPoints, Long userBuyNum)
	{
		super();
		this.goodsId=goodsId;
		this.goodsTypeId=goodsTypeId;
		this.goodsName=goodsName;
		this.goodsDesc=goodsDesc;
		this.money=money;
		this.firstImage=firstImage;
		this.goodsLevel=goodsLevel;
		this.goodsPoints=goodsPoints;
		this.userBuyNum=userBuyNum;
	}
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

	public Long getUserBuyNum() {
		return userBuyNum;
	}

	public void setUserBuyNum(Long userBuyNum) {
		this.userBuyNum = userBuyNum;
	}

	public String getIsTopGoods() {
		return isTopGoods;
	}

	public void setIsTopGoods(String isTopGoods) {
		this.isTopGoods = isTopGoods;
	}
}
