package com.arun.HibernateFourth;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;


@Entity(name="SPRINGERS")
public class Springers 
{
	
	@Id
	@Column(name="ID")
	private Integer id;
	
	@Column(name="Name")
	private String name; 
	
	@Temporal(TemporalType.DATE)
	@Column(name="DATE")
	private Date dt1;
	
	@Temporal(TemporalType.TIME)
	@Column(name="TIME")
	private Date dt2;
	
	
	@Temporal(TemporalType.TIMESTAMP)
	@Column(name="DATETIME")
	private Date dt3;


	public Integer getId() {
		return id;
	}
	
	
	public Springers()
	{
		System.out.println("Object is Created");
	}


	@Override
	public String toString() {
		return "Springers [id=" + id + ", name=" + name + ", dt1=" + dt1 + ", dt2=" + dt2 + ", dt3=" + dt3 + "]";
	}


	public void setId(Integer id) {
		this.id = id;
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public Date getDt1() {
		return dt1;
	}


	public void setDt1(Date dt1) {
		this.dt1 = dt1;
	}


	public Date getDt2() {
		return dt2;
	}


	public void setDt2(Date dt2) {
		this.dt2 = dt2;
	}


	public Date getDt3() {
		return dt3;
	}


	public void setDt3(Date dt3) {
		this.dt3 = dt3;
	}
	
	
	

}
