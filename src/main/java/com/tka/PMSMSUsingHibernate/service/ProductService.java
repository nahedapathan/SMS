package com.tka.PMSMSUsingHibernate.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.tka.PMSMSUsingHibernate.entity.Product;
import com.tka.PMSMSUsingHibernate.repository.ProductRepository;

@Service
public class ProductService {

	@Autowired
	ProductRepository repository;
	
	public void addProduct(Product p)
	{
		repository.save(p);
		
	}
	
	public void updateProduct(Product p, int id)
	{
		
	}
	
	public List<Product> showProductList()
	{
		return repository.findAll();
	}
	
	public String deleteProduct(int id)
	{
		repository.deleteById(id);
		return "Product deleted";
	}
}
