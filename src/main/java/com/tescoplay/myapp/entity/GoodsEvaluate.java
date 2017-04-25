package com.tescoplay.myapp.entity;

import com.tescoplay.myapp.utils.DateUtil;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class GoodsEvaluate implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long goodsEvaluateId;

	@Column(nullable = false)
	private Long goodsId;

	@Column(nullable = false)
	private String goods_evaluate;

	@Column(nullable = false)
	private Long goodsEvaluateLevel;

	@Column(nullable = false)
	private Date goodsEvaluateDate;


	public Long getGoodsEvaluateId() {
		return goodsEvaluateId;
	}

	public void setGoodsEvaluateId(Long goodsEvaluateId) {
		this.goodsEvaluateId = goodsEvaluateId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public String getGoods_evaluate() {
		return goods_evaluate;
	}

	public void setGoods_evaluate(String goods_evaluate) {
		this.goods_evaluate = goods_evaluate;
	}

	public Long getGoodsEvaluateLevel() {
		return goodsEvaluateLevel;
	}

	public void setGoodsEvaluateLevel(Long goodsEvaluateLevel) {
		this.goodsEvaluateLevel = goodsEvaluateLevel;
	}

	public Date getGoodsEvaluateDate() {
		return goodsEvaluateDate;
	}

	public void setGoodsEvaluateDate(Date goodsEvaluateDate) {
		this.goodsEvaluateDate = goodsEvaluateDate;
	}

}
