package com.cg.spring.lab.model;


public class Employee {
     int  eid;
     String ename;
     double sal;
     String bu;
     int age;
     
     
	public Employee() {
		super();
	}
	public Employee(int eid, String ename, double sal, String bu, int age) {
		super();
		this.eid = eid;
		this.ename = ename;
		this.sal = sal;
		this.bu = bu;
		this.age = age;
	}
	public int getEid() {
		return eid;
	}
	public void setEid(int eid) {
		this.eid = eid;
	}
	public String getEname() {
		return ename;
	}
	public void setEname(String ename) {
		this.ename = ename;
	}
	public double getSal() {
		return sal;
	}
	public void setSal(double sal) {
		this.sal = sal;
	}
	public String getBu() {
		return bu;
	}
	public void setBu(String bu) {
		this.bu = bu;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "Employee Id=" + eid+ "\nEmployee Name=" + ename + "\nEmployee Salary=" + sal + "\nEmployee BU=" + bu + "\nEmployee Age=" + age;
	}
     
}
