package com.glqdlt.myhome.domain.user;

import javax.persistence.*;

@Entity
@Table(name = "tbl_user")
public class User {

	@Id
	@GeneratedValue
	private Integer no;

	private String name;
	private String id;
	private String password;
	private String email;
	private String address;
	private String phone;
	private Integer role;

	public User() {
	}

	public User(String name, String id, String password, String email, String address, String phone, Integer role) {
		this.name = name;
		this.id = id;
		this.password = password;
		this.email = email;
		this.address = address;
		this.phone = phone;
		this.role = role;
	}

	public Integer getNo() {
		return no;
	}

	public void setNo(Integer no) {
		this.no = no;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public Integer getRole() {
		return role;
	}

	public void setRole(Integer role) {
		this.role = role;
	}
	
	@Override
	public String toString() {
		return "id:"+id+", password:"+password;
	}

}
