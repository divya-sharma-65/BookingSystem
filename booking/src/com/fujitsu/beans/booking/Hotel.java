package com.fujitsu.beans.booking;

import java.sql.Blob;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.stereotype.Component;

@Component
@Entity
@Table
public class Hotel {

	@Id
	@GeneratedValue(generator="increment")
	private  int hotelId;
	
	@OneToMany(mappedBy="hotelId")
	private List<Room>rooms;
	
	@OneToMany(mappedBy="hotelId")
	private List<Booking>booking;
	
	@Column(length=20)
	private String hotelName;
	@Column(length=20,unique=true)
	private String website;
	@Column(length=1)
	private int rating;
	@Column(length=50)
	private String review;
	@Column(length=10,unique=true)
	private long phoneNo;
	@Column(length=30,unique=true)
	private String 	emailId;
	@Column(length=100)
	private String address;
	@Column(length=4,unique=true)
	private int countrycode;
	@Column(length=20)
	private String city;
	@Column(length=20)
	private String state;
	@Column(length=20)
	private String country;
	@Column(length=10)
	private int zip;
	@Column
	private Blob hotelPhoto;
	@Column(length=3)
	private int totalNoOfRooms;
	@Column(length=3)
	private int availableRooms;
	

}
