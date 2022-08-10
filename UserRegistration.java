package com.medicare.healthcare.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="UserRegistration")
public class UserRegistration {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="usr_Id")
	private int usr_Id;
	@Column(name="first_Name")
	private String first_Name;
	@Column(name="last_Name")
	private String last_Name;
	@Column(name="gender")
	private String gender;
//	@Temporal(TemporalType.TIMESTAMP)
	@DateTimeFormat(pattern = "yyyy-MM-dd'T'HH:mm:ss")
	@Column(name="dob")
	private Date dob;
	@Column(name="email")
	private String email;
	@Column(name="usr_password")
	private String usr_password;
	@Column(name="usr_role")
	private String usr_role;
	public UserRegistration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public UserRegistration(int usr_Id, String first_Name, String last_Name, String gender,Date dob, String email,
			String usr_password, String usr_role) {
		super();
		this.usr_Id = usr_Id;
		this.first_Name = first_Name;
		this.last_Name = last_Name;
		this.gender = gender;
		this.dob = dob;
		this.email = email;
		this.usr_password = usr_password;
		this.usr_role = usr_role;
	}
	public int getUsr_Id() {
		return usr_Id;
	}
	public void setUsr_Id(int usr_Id) {
		this.usr_Id = usr_Id;
	}
	public String getFirst_Name() {
		return first_Name;
	}
	public void setFirst_Name(String first_Name) {
		this.first_Name = first_Name;
	}
	public String getLast_Name() {
		return last_Name;
	}
	public void setLast_Name(String last_Name) {
		this.last_Name = last_Name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDob() {
		return dob;
	}
	public void setDob(Date dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getUsr_password() {
		return usr_password;
	}
	public void setUsr_password(String usr_password) {
		this.usr_password = usr_password;
	}
	public String getUsr_role() {
		return usr_role;
	}
	public void setUsr_role(String usr_role) {
		this.usr_role = usr_role;
	}
	@Override
	public String toString() {
		return "UserRegistration [usr_Id=" + usr_Id + ", first_Name=" + first_Name + ", last_Name=" + last_Name
				+ ", gender=" + gender + ", dob=" + dob + ", email=" + email + ", usr_password=" + usr_password
				+ ", usr_role=" + usr_role + "]";
	}





}