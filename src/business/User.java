package business;

import java.io.Serializable;

public class User implements Serializable {

	private String name;
	private String email;
	private int courses;
	private String employmentStatus;
	private boolean hotel;
	private boolean parking;
	
	public User(String name) {
		this.name = name; 
	}
	
	public User(String name, String email, int courses, String employmentStatus, boolean hotel, boolean parking) {
		this.name = name;
		this.email = email;
		this.courses = courses;
		this.employmentStatus = employmentStatus;
		this.hotel = hotel;
		this.parking = parking;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getCourses() {
		return courses;
	}
	public void setCourses(int courses) {
		this.courses = courses;
	}
	public String getEmploymentStatus() {
		return employmentStatus;
	}
	public void setEmploymentStatus(String employmentStatus) {
		this.employmentStatus = employmentStatus;
	}
	public boolean isHotel() {
		return hotel;
	}
	public void setHotel(boolean hotel) {
		this.hotel = hotel;
	}
	public boolean isParking() {
		return parking;
	}
	public void setParking(boolean parking) {
		this.parking = parking;
	}

}
