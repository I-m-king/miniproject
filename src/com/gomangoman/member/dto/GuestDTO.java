package com.gomangoman.member.dto;

public class GuestDTO {
	
	private String name;
	private int phone;
	private int money;
	private double point;
//	productDTO 배열
	public GuestDTO() {
	}
	public GuestDTO(String name, int phone, int money) {
		super();
		this.name = name;
		this.phone = phone;
		this.money = money;
		
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
		return "성함은 " + name + "입니다." + ", 전화번호 뒷자리는 " + phone + "입니다" + "갖고있는 돈은" + money + "입니다" +"적립된 포인트는" + point +" 입니다";
	}
	
	

}
