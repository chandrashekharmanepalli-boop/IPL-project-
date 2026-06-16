package com.tka.entity;

public class IPL_Player {

	private String team_name;
	private int jr_no;
	private String player_name;
	private int run;
	private int wicket;
	
	public IPL_Player() {
		// TODO Auto-generated constructor stub
	}
	
	
	public IPL_Player(String team_name, int jr_no, String player_name, int run, int wicket) {
		super();
		this.team_name = team_name;
		this.jr_no = jr_no;
		this.player_name = player_name;
		this.run = run;
		this.wicket = wicket;
	}
	
	
	@Override
	public String toString() {
		return "IPL_Player [team_name=" + team_name + ", jr_no=" + jr_no + ", player_name=" + player_name + ", run="
				+ run + ", wicket=" + wicket + "]";
	}
	
	
	public String getTeam_name() {
		return team_name;
	}
	public void setTeam_name(String team_name) {
		this.team_name = team_name;
	}
	public int getJr_no() {
		return jr_no;
	}
	public void setJr_no(int jr_no) {
		this.jr_no = jr_no;
	}
	public String getPlayer_name() {
		return player_name;
	}
	public void setPlayer_name(String player_name) {
		this.player_name = player_name;
	}
	public int getRun() {
		return run;
	}
	public void setRun(int run) {
		this.run = run;
	}
	public int getWicket() {
		return wicket;
	}
	public void setWicket(int wicket) {
		this.wicket = wicket;
	}
	

}
