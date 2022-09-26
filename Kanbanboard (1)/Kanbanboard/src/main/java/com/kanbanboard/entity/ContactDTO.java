package com.kanbanboard.entity;

public class ContactDTO {

	private Integer contactId;
	private String userName;
	private String email;
	private String phoneNo;
	private String message;
	
	public ContactDTO() {
		super();
	}

	public ContactDTO(Integer contactId, String userName, String email, String phoneNo, String message) {
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
	
	
}
