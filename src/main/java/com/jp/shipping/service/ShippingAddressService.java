package com.jp.shipping.service;

import java.util.Collections;
import java.util.List;

import com.jp.model.user.Address;

public class ShippingAddressService {

	public List<Address> getAddressList() {
		return createAddressList();
	}
	
	private List<Address> createAddressList() {
		Address address = new Address();
		address.setAddress1("287 Apple Dr");
		address.setCity("Exton");
		address.setState("PA");
		address.setZipCode("19341");
		return Collections.singletonList(address);
	}
}