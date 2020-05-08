package com.reavture.beans;

public class Bear {
	private int bear_id;
	private int bear_type_id;
	private String bear_name;
	private String bear_birthdate;
	private int bear_weight;
	private int cave_id;
	
	public Bear(int bear_id, int bear_type_id, String bear_name, String bear_birthdate, int bear_weight, int cave_id) {
		super();
		this.bear_id = bear_id;
		this.bear_type_id = bear_type_id;
		this.bear_name = bear_name;
		this.bear_birthdate = bear_birthdate;
		this.bear_weight = bear_weight;
		this.cave_id = cave_id;
	}
	
	
	public Bear() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getBear_id() {
		return bear_id;
	}


	public void setBear_id(int bear_id) {
		this.bear_id = bear_id;
	}


	public int getBear_type_id() {
		return bear_type_id;
	}


	public void setBear_type_id(int bear_type_id) {
		this.bear_type_id = bear_type_id;
	}


	public String getBear_name() {
		return bear_name;
	}


	public void setBear_name(String bear_name) {
		this.bear_name = bear_name;
	}


	public String getBear_birthdate() {
		return bear_birthdate;
	}


	public void setBear_birthdate(String bear_birthdate) {
		this.bear_birthdate = bear_birthdate;
	}


	public int getBear_weight() {
		return bear_weight;
	}


	public void setBear_weight(int bear_weight) {
		this.bear_weight = bear_weight;
	}


	public int getCave_id() {
		return cave_id;
	}


	public void setCave_id(int cave_id) {
		this.cave_id = cave_id;
	}


	@Override
	public String toString() {
		return "Bear [bear_id=" + bear_id + ", bear_type_id=" + bear_type_id + ", bear_name=" + bear_name
				+ ", bear_birthdate=" + bear_birthdate + ", bear_weight=" + bear_weight + ", cave_id=" + cave_id + "]";
	}
	
	
	

}
