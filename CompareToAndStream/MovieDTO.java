package com.xworkz.Collection.CompareToAndStream;

import java.time.LocalDate;
import java.util.Objects;

public class MovieDTO implements Comparable<MovieDTO>{
	
	private String name;
	private double budget;
	private String date;
	private String language;
	private double prize;
	
	

	public MovieDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public int hashCode() {
		return 20;
	}

	@Override
	public boolean equals(Object obj) {
		if(obj!=null) {
			if(obj instanceof Object) {
			
				MovieDTO ref=(MovieDTO)obj;
				if(ref.name.equals(this.name)&& ref.language.equals(this.language)) {
					return true;
				}
				
			}
		}
		return false;
	}

	public MovieDTO(String name, double budget, String date, String language, double prize) {
		super();
		this.name = name;
		this.budget = budget;
		this.date = date;
		this.language = language;
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Movie [name=" + name + ", budget=" + budget + ", date=" + date + ", language=" + language + ", prize="
				+ prize + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getBudget() {
		return budget;
	}

	public void setBudget(double budget) {
		this.budget = budget;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public double getPrize() {
		return prize;
	}

	public void setPrize(double prize) {
		this.prize = prize;
	}
	
	//Asending Order
	
	/*
	 * public int compareTo(MovieDTO o) {
	 * 
	 * return this.name.compareTo(o.name); }
	 */
	
	@Override
	public int compareTo(MovieDTO o) {
		
		return (int) (this.budget - o.budget);
	}
	

}
