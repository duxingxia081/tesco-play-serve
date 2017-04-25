package com.tescoplay.myapp.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Users implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue
	private Long user_Id;

	@Column(nullable = false)
	private String userLevel;

	@Column(nullable = false)
	private String name;

	@Column(nullable = false)
	private Long accumulatePoints;

	@Column(nullable = false)
	private Date createdDate;

	@Column(nullable = false)
	private String isActive;

	public Long getUser_Id() {
		return user_Id;
	}

	public void setUser_Id(Long user_Id) {
		this.user_Id = user_Id;
	}

	public String getUserLevel() {
		return userLevel;
	}

	public void setUserLevel(String userLevel) {
		this.userLevel = userLevel;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Long getAccumulatePoints() {
		return accumulatePoints;
	}

	public void setAccumulatePoints(Long accumulatePoints) {
		this.accumulatePoints = accumulatePoints;
	}

	public Date getCreatedDate() {
		return createdDate;
	}

	public void setCreatedDate(Date createdDate) {
		this.createdDate = createdDate;
	}

	public String getIsActive() {
		return isActive;
	}

	public void setIsActive(String isActive) {
		this.isActive = isActive;
	}
}
