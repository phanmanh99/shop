package com.leesai.shop.service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

import com.leesai.shop.dao.ContactDao;
import com.leesai.shop.model.Contact;

public class ContactService implements ContactDao {

	@Override
	public Optional<Contact> get(UUID iUuid) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public List<Contact> getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Optional<Contact> create(Contact object) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public Optional<Contact> update(Contact object) {
		// TODO Auto-generated method stub
		return Optional.empty();
	}

	@Override
	public int delete(UUID iUuid) {
		// TODO Auto-generated method stub
		return 0;
	}
	}
