package com.kanbanboard.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name ="ContactUs")
public class Contact {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer contactId;
	private String userName;
	private String email;
	private String phoneNo;
	private String message;
	
	public Contact() {
		super();
	}

	public Contact(Integer contactId, String userName, String email, String phoneNo, String message) {
		super();
		this.contactId = contactId;
		this.userName = userName;
		this.email = email;
		this.phoneNo = phoneNo;
		this.message = message;
	}

	public Integer getContactId() {
		return contactId;
	}

	public void setContactId(Integer contactId) {
		this.contactId = contactId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	@Override
	public String toString() {
		return "ContactUs [contactId=" + contactId + ", userName=" + userName + ", email=" + email + ", phoneNo="
				+ phoneNo + ", message=" + message + "]";
	}
	
	
}
