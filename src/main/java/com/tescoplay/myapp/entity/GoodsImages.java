package com.tescoplay.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;

@Entity
public class GoodsImages implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long goodsImagesId;

	@Column(nullable = false)
	private Long goodsId;

	@Column(nullable = false)
	private byte[] image;

	public Long getGoodsImagesId() {
		return goodsImagesId;
	}

	public void setGoodsImagesId(Long goodsImagesId) {
		this.goodsImagesId = goodsImagesId;
	}

	public Long getGoodsId() {
		return goodsId;
	}

	public void setGoodsId(Long goodsId) {
		this.goodsId = goodsId;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
}
