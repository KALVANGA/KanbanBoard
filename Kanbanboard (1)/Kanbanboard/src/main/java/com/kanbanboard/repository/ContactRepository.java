package com.kanbanboard.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kanbanboard.entity.Contact;
import com.kanbanboard.entity.ContactDTO;
import com.kanbanboard.entity.User;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
	
	Contact save(Contact contactUs);
}
