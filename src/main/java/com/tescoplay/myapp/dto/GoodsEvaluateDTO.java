package com.tescoplay.myapp.dto;

import com.tescoplay.myapp.utils.DateUtil;

import java.util.Date;

public class GoodsEvaluateDTO{

	private Long goodsEvaluateId;

	private Long goodsId;

	private String goods_evaluate;

	private Long goodsEvaluateLevel;

	private Date goodsEvaluateDate;

	private String goodsEvaluateDateStr;
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

	public String getGoodsEvaluateDateStr() {
		return DateUtil.formatDate(goodsEvaluateDate);
	}

	public void setGoodsEvaluateDateStr(String goodsEvaluateDateStr) {
		this.goodsEvaluateDateStr = goodsEvaluateDateStr;
	}
}
