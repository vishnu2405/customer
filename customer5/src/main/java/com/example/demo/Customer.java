package com.example.demo;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Customer")
public class Customer {
	
	@Id
	@GeneratedValue
	@Column(name="cId")
	private Integer bookId;
	@Column(name="cLoc")
	private String location;
	@Column(name="cHours")
	private int noOfHours;
	@Column(name="cDate")
	private String date;
	@Column(name="cTime")
	private String time;
	@Column(name="cSeats")
	private int seatsRequired;

	public int getBookId() {
		return bookId;
	}
	public void setBookId(int bookId) {
		this.bookId = bookId;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getNoOfHours() {
		return noOfHours;
	}
	public void setNoOfHours(int noOfHours) {
		this.noOfHours = noOfHours;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public int getSeatsRequired() {
		return seatsRequired;
	}
	public void setSeatsRequired(int seatsRequired) {
		this.seatsRequired = seatsRequired;
	}
	public Customer(int bookId, String location, int noOfHours, String date, String time, int seatsRequired) {
		super();
		this.bookId = bookId;
		this.location = location;
		this.noOfHours = noOfHours;
		this.date = date;
		this.time = time;
		this.seatsRequired = seatsRequired;
	}
	
	public Customer() {
		super();
	}
	
	@Override
	public String toString() {
		return "Customer [bookId=" + bookId + ", location=" + location + ", noOfHours=" + noOfHours + ", date=" + date
				+ ", time=" + time + ", seatsRequired=" + seatsRequired + "]";
	}

}
