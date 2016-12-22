package com.fengtaiguang.photoalbum.domain.entity;

import java.io.Serializable;
import java.sql.Timestamp;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import com.fengtaiguang.ddd.framwork.domain.aggregate.AggregateRootBase;
@Service("album")
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public  class Album extends AggregateRootBase<Album> implements Serializable {

	protected String id;
	protected String name;
	protected String description;
	protected Integer number;
	protected Timestamp createDate;
	protected String userId;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getNumber() {
		return number;
	}

	public void setNumber(Integer number) {
		this.number = number;
	}

	public Timestamp getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Timestamp createDate) {
		this.createDate = createDate;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	@Override
	public String toString() {
		return "Album [id=" + id + ", name=" + name + ", description=" + description + ", number=" + number
				+ ", createDate=" + createDate + ", userId=" + userId + "]";
	}


	
}
