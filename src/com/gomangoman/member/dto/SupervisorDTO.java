package com.gomangoman.member.dto;

public class SupervisorDTO {
	private String id = "goman";
	private String pwd = "1234!";
	public SupervisorDTO() {
	}
	public SupervisorDTO(String id, String pwd) {
		super();
		this.id = id;
		this.pwd = pwd;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	
	

}
