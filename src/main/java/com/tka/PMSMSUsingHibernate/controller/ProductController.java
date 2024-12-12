package com.tka.PMSMSUsingHibernate.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.tka.PMSMSUsingHibernate.entity.Product;
import com.tka.PMSMSUsingHibernate.service.ProductService;

@RestController
public class ProductController {

	@Autowired
	ProductService service;
	
	@PostMapping("/addProduct")
	public String addProduct(@RequestBody Product p)
	{
		service.addProduct(p);
		return "Product added successfully";
	}
	
	@GetMapping("/productList")
	public List<Product> showProductList()
	{
		return service.showProductList();
	}
	
	@DeleteMapping("/deleteProduct")
	public String deleteProduct(@RequestParam int id)
	{
		return service.deleteProduct(id);
	}
	
}
