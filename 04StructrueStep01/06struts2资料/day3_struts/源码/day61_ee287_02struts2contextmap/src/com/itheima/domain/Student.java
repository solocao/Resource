package com.itheima.domain;

import java.io.Serializable;

/**
 * 一个学生的实体类
 * @author zhy
 *
 */
public class Student implements Serializable {

	private String name;
	private Integer age;
	private String gender;
	private Boolean married;
	
	public Boolean isMarried(){
		return married;
	}
	
	public Student(){
		
	}
	
	public Student(String name, Integer age, String gender) {
		this.name = name;
		this.age = age;
		this.gender = gender;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + ", gender=" + gender + "]";
	}
	
	
}
