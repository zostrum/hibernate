package com.jvmhub.tutorial.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "AppPost")
@Table(name = "posts")
public class AppPost implements Serializable {

	private static final long serialVersionUID = 2331667441052735161L;

	public AppPost() {

	};

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String name;
	private String ab;

	@Column(columnDefinition = "text")
	private String description;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
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

	public String getAb() {
		return ab;
	}

	public void setAb(String ab) {
		this.ab = ab;
	}
}