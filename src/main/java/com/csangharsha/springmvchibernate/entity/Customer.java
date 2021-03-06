package com.csangharsha.springmvchibernate.entity;

import javax.persistence.*;

@Entity
@Table(name = "customer")
public class Customer {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;

	@Column(name = "first_name")
	private String firstName;

	@Column(name = "last_name")
	private String lastName;

	@Column(name = "gender")
	private String gender;

	@Column(name = "address")
	private String address;

	public int getId( ) {
		return id;
	}

	public void setId( int id ) {
		this.id = id;
	}

	public String getFirstName( ) {
		return firstName;
	}

	public void setFirstName( String firstName ) {
		this.firstName = firstName;
	}

	public String getLastName( ) {
		return lastName;
	}

	public void setLastName( String lastName ) {
		this.lastName = lastName;
	}

	public String getGender( ) {
		return gender;
	}

	public void setGender( String gender ) {
		this.gender = gender;
	}

	public String getAddress( ) {
		return address;
	}

	public void setAddress( String address ) {
		this.address = address;
	}
}
