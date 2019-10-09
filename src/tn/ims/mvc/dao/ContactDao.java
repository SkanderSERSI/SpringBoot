package tn.ims.mvc.dao;

import java.util.List;

import tn.ims.mvc.model.Contact;

public interface ContactDao {

	public boolean create(Contact contact);
	public List<Contact> findAll();
}
