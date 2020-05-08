package com.reavture.beans;

public class Power {
	private int power_id;
	private String power_name;
	
	public Power() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Power(int power_id, String power_name) {
		super();
		this.power_id = power_id;
		this.power_name = power_name;
	}

	public int getPower_id() {
		return power_id;
	}

	public void setPower_id(int power_id) {
		this.power_id = power_id;
	}

	public String getPower_name() {
		return power_name;
	}

	public void setPower_name(String power_name) {
		this.power_name = power_name;
	}

	@Override
	public String toString() {
		return "Power [power_id=" + power_id + ", power_name=" + power_name + "]";
	}
	
	
	
}
