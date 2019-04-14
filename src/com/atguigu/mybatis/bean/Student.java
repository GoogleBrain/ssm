package com.atguigu.mybatis.bean;

import java.io.Serializable;

public class Student implements Serializable {

	private static final long serialVersionUID = 1L;

	private Integer id;
	private String name_person;
	private Integer age;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName_person() {
		return name_person;
	}

	public void setName_person(String name_person) {
		this.name_person = name_person;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}
}
