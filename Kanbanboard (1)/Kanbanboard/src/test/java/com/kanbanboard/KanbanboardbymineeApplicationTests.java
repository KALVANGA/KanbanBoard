package com.kanbanboard;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.kanbanboard.entity.Contact;
import com.kanbanboard.entity.ContactDTO;
import com.kanbanboard.service.ContactService;

@SpringBootTest
class KanbanboardbymineeApplicationTests {
	
	@Autowired
	private ContactService contactUsService;

	@Test
	void createContactUsTest() {
		
		ContactDTO contactUsDTO = new ContactDTO(4,"Divya","divya@gmail.com","9458712457","nice");
	}

}
