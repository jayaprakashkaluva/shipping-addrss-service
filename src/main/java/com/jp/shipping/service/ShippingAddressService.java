package com.jp.shipping.service;

import java.util.Collections;
import java.util.List;

import org.springframework.stereotype.Service;

import com.jp.model.user.Address;

@Service
public class ShippingAddressService {

	public List<Address> getAddressList() {
		return createAddressList();
	}
	
	private List<Address> createAddressList() {
		Address address = new Address();
		address.setStreet("287 Apple Dr");
		address.setCity("Exton");
		address.setState("PA");
		address.setZipCode("19341");
		return Collections.singletonList(address);
	}
}