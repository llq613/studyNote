package com.qd.po;

public class EmpInfo {
    private String id;
    private String name;
    private String sex;
    private Integer age;
    private Dept dept;
    
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
	public String getSex() {
		return sex;
	}
	public void setSex(String sex) {
		this.sex = sex;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Dept getDept() {
		return dept;
	}
	public void setDept(Dept dept) {
		this.dept = dept;
	}
	@Override
	public String toString() {
		return "EmpInfo [id=" + id + ", name=" + name + ", sex=" + sex + ", age=" + age + ", dept=" + dept + "]";
	}

    
}
