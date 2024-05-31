package com.broadway.springboot.serviceImpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.broadway.springboot.model.Address;
import com.broadway.springboot.repository.AddressRepository;
import com.broadway.springboot.service.AddressService;
@Service
public class AddressServiceImpl implements AddressService{
	@Autowired
AddressRepository ar;

	@Override
	public void addAddress(Address address) {
		// TODO Auto-generated method stub
		ar.save(address);
	}

}
