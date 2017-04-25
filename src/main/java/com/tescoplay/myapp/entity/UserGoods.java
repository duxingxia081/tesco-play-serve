package com.tescoplay.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class UserGoods implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long userGoodsId;

	@Column(nullable = false)
	private Long goodsId;

	@Column(nullable = false)
	private Long userId;

	@Column(nullable = false)
	private Date buyDate;

	@Column(nullable = false)
	private Long buyNum;

	@Column(nullable = false)
	private Float buyMoney;

	@Column(nullable = false)
	private String isActive;

	public Long getUserGoodsId() {
		return userGoodsId;
	}

	public void setUserGoodsId(Long userGoodsId) {
		this.userGoodsId = userGoodsId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Date getBuyDate() {
		return buyDate;
	}

	public void setBuyDate(Date buyDate) {
		this.buyDate = buyDate;
	}

	public Long getBuyNum() {
		return buyNum;
	}

	public void setBuyNum(Long buyNum) {
		this.buyNum = buyNum;
	}

	public Float getBuyMoney() {
		return buyMoney;
	}

	public void setBuyMoney(Float buyMoney) {
		this.buyMoney = buyMoney;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
}
