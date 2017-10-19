package com.ibm.crm.base;

public class Address {
	@Override
	public String toString() {
		return "Address [id=" + id + ", address=" + address + "]";
	}
	private int id;
	private String address;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int id, String address) {
		super();
		this.id = id;
		this.address = address;
	}
	
}
