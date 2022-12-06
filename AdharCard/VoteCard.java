package com.xworkz.AdharCard;

public class VoteCard extends PanCard{
	
	public String voterId;

	public VoteCard(String name, long adharNo, String dob, String address, String panNo,String voterId) {
		super(name, adharNo, dob, address, panNo);
		this.voterId=voterId;
	}
	
	public void voterIdIs() {
		System.out.println("to do vote in election");
	}
	public void displayInfoVote() {
		System.out.println("Vote No :"+voterId);
	}
}
