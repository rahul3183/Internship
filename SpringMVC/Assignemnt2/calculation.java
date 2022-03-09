package com.spring.Q2;

public class calculation {

	private int amount;
	private int time;
	private int rate;
	
	
	
	public int getAmount() {
		return amount;
	}



	public void setAmount(int amount) {
		this.amount = amount;
	}



	public int getTime() {
		return time;
	}


	public void setTime(int time) {
		this.time = time;
	}



	public int getRate() {
		return rate;
	}



	public void setRate(int rate) {
		this.rate = rate;
	}



	public double calculate() {
		return  (getAmount()*getRate()*getTime())/100;
	}
	
}
