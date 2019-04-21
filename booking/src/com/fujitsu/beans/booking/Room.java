package com.fujitsu.beans.booking;

import java.sql.Blob;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "ROOMS")
public class Room {

	@Id
	@Column(length=10,name="ROOM_ID")
	private int roomId;
	@Column(length=10,nullable=false,unique=true)
	private String roomType;
	@Column(length=3,nullable=false,unique=true)
	private String availability;
	private float roomPrice;
	private Blob roomPhoto;
	@ManyToOne(cascade=CascadeType.ALL)
	private Hotel hotelId;
	
public Room() {
	// TODO Auto-generated constructor stub
}

public Room(int roomId, String roomType, String availability, float roomPrice, Blob roomPhoto, Hotel hotelId) {
	super();
	this.roomId = roomId;
	this.roomType = roomType;
	this.availability = availability;
	this.roomPrice = roomPrice;
	this.roomPhoto = roomPhoto;
	this.hotelId = hotelId;
}

public int getRoomId() {
	return roomId;
}

public void setRoomId(int roomId) {
	this.roomId = roomId;
}

public String getRoomType() {
	return roomType;
}

public void setRoomType(String roomType) {
	this.roomType = roomType;
}

public String getAvailability() {
	return availability;
}

public void setAvailability(String availability) {
	this.availability = availability;
}

public float getRoomPrice() {
	return roomPrice;
}

public void setRoomPrice(float roomPrice) {
	this.roomPrice = roomPrice;
}

public Blob getRoomPhoto() {
	return roomPhoto;
}

public void setRoomPhoto(Blob roomPhoto) {
	this.roomPhoto = roomPhoto;
}

public Hotel getHotelId() {
	return hotelId;
}

public void setHotelId(Hotel hotelId) {
	this.hotelId = hotelId;
}






}
