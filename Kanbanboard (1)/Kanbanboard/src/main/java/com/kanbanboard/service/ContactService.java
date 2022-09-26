package com.kanbanboard.service;

import java.util.List;

import com.kanbanboard.entity.Contact;
import com.kanbanboard.entity.ContactDTO;


public interface ContactService {
	public Contact createContact(ContactDTO contactDTO);
	public List<Contact> showAllContact();
}
