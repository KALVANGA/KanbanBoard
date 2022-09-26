package com.kanbanboard.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.kanbanboard.entity.Contact;
import com.kanbanboard.entity.ContactDTO;
import com.kanbanboard.repository.ContactRepository;
import com.kanbanboard.service.ContactService;
import com.kanbanboard.service.ContactServiceImpl;

@RestController
@RequestMapping(value = "ContactAPI")
@CrossOrigin(origins = "http://localhost:4200", methods= {RequestMethod.DELETE, RequestMethod.GET, RequestMethod.PUT,
		RequestMethod.POST })
public class ContactController {
	
	@Autowired
	private ContactServiceImpl contactServiceImpl;
	
	@Autowired
	private ContactRepository contactRepo;
	
	@PostMapping("/addContact")
	public Contact createContact(@RequestBody ContactDTO contactDTO) {
		System.out.println("Contact controller --- addContact");
		return this.contactServiceImpl.createContact(contactDTO);
	}
	
	@GetMapping("/getContacts")
	public List<Contact> showAllContact(){
		List<Contact> data = contactRepo.findAll();
		return data;
	}
}