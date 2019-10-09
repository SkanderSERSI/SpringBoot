package tn.ims.mvc;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import tn.ims.mvc.dao.ContactDao;
import tn.ims.mvc.model.Contact;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;



@RestController
public class ContactController {
	
	
	@Autowired
	ContactDao contactDao;
	

	@PostMapping("/contacts")
	public ResponseEntity<Void> createContact(@RequestBody Contact contact) {
		boolean isCreated = this.contactDao.create(contact);
		if (isCreated) 
			return new ResponseEntity<Void>(HttpStatus.CREATED);
		else
			return new ResponseEntity<Void>(HttpStatus.BAD_REQUEST);
	}
	
	
	@GetMapping("/contacts")
	public ResponseEntity<List<Contact>> getContacts(){
		List<Contact> contacts = this.contactDao.findAll();
		System.out.println(contacts.get(0));
		ResponseEntity<List<Contact>> response = new ResponseEntity<List<Contact>>(contacts, HttpStatus.FOUND);
		return response;
	}

}
