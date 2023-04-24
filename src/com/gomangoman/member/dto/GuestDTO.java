package com.gomangoman.member.dto;

public class GuestDTO {
	
	private String name;
	private int phone;
	private int money;
	private double point;
//	productDTO 배열
	public GuestDTO() {
	}
	public GuestDTO(String name, int phone, int money, double point) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		this.point = point;
}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPhone() {
		return phone;
	}
	public void setPhone(int phone) {
		this.phone = phone;
	}
	public int getMoney() {
		return money;
	}
	public void setMoney(int money) {
		this.money = money;
	}
	public double getPoint() {
		return point;
	}
	public void setPoint(double point) {
		this.point = point;
	}
	
	@Override
	public String toString() {
		return "GuestDTO [name=" + name + ", phone=" + phone + ", money=" + money + ", point=" + point + "]";
	}
	
	

}
