package com.jp.shipping.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.jp.model.user.Address;
import com.jp.shipping.service.ShippingAddressService;

@RestController
public class ShippingAddressController {
	
	@Autowired
	private ShippingAddressService shippingAddressService;

	@GetMapping("/users/{userId}/shippingAddress")
	public List<Address> getAddressList(@PathVariable String userId) {
		return shippingAddressService.getAddressList();
	}
}
