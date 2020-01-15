package com.duck.vo;

public class MovieVO{
	private int movie_id; 
	private String movie_name; 
	private String director; 
	private String type; 
	
	public int getmovie_id() { return movie_id; }  
	public void setmovie_id(int movie_id) {this.movie_id = movie_id;}
	
    public String getmovie_name() { return movie_name; }  
	public void setmovie_name(String movie_name) {this.movie_name = movie_name;}
	
    public String getdirector() { return director; }  
	public void setdirector(String director) {this.director = director;}
	
    public String gettypes() { return type; }  
	public void settypes(String type) {this.type = type;}
	
};