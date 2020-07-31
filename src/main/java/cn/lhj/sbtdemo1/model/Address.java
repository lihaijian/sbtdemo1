package cn.lhj.sbtdemo1.model;

import org.springframework.stereotype.Component;

//@Component
public class Address {
	private int id;
	private String detail;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDetail() {
		return detail;
	}
	public void setDetail(String detail) {
		this.detail = detail;
	}
	@Override
	public String toString() {
		return "Address [id=" + id + ", detail=" + detail + "]";
	}
	
}
