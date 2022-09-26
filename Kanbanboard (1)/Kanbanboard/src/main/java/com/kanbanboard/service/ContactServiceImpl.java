package com.kanbanboard.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.kanbanboard.entity.Contact;
import com.kanbanboard.entity.ContactDTO;
import com.kanbanboard.repository.ContactRepository;

@Service
public class ContactServiceImpl implements ContactService {

	@Autowired
	private ContactRepository contactUsRepo;
	@Override
	public Contact createContact(ContactDTO contactDTO) {
		System.out.println("ContactUsServiceImpl -- addContact");
		
		Contact contact = new Contact();
		
		contact.setContactId(contactDTO.getContactId());
		contact.setUserName(contactDTO.getUserName());
		contact.setEmail(contactDTO.getEmail());
		contact.setPhoneNo(contactDTO.getPhoneNo());
		contact.setMessage(contactDTO.getMessage());
		
		System.out.println(contact);
		return this.contactUsRepo.save(contact);
	}

	@Override
	public List<Contact> showAllContact() {

		return this.contactUsRepo.findAll(Sort.by(Sort.Direction.ASC,"contactId"));
	}


	
}
