package tn.ims.mvc.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import tn.ims.mvc.model.Contact;

@Repository
public class ImplContactDao implements ContactDao {
	
	List<Contact> contacts = new ArrayList<Contact>();

	@Override
	public boolean create(Contact contact) {
		return contacts.add(contact);
	}

	@Override
	public List<Contact> findAll() {
		return contacts;
	}

}
