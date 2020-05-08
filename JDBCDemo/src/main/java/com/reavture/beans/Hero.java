package com.reavture.beans;

public class Hero {
	private int hero_id;
	private String hero_name;
	
	public Hero(int hero_id, String hero_name) {
		super();
		this.hero_id = hero_id;
		this.hero_name = hero_name;
	}
	public Hero() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getHero_id() {
		return hero_id;
	}
	public void setHero_id(int hero_id) {
		this.hero_id = hero_id;
	}
	public String getHero_name() {
		return hero_name;
	}
	public void setHero_name(String hero_name) {
		this.hero_name = hero_name;
	}
	@Override
	public String toString() {
		return "Hero [hero_id=" + hero_id + ", hero_name=" + hero_name + "]";
	}
	
	

}
