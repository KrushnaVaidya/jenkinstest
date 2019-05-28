package com.globant.springbootdocker;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductRestController {
	List<Product>products=new ArrayList<Product>();
	public ProductRestController() {
		products.add(new Product(12,"pen",11));
		products.add(new Product(33,"marker",33));
		products.add(new Product(11,"abc",99));
	}
	@GetMapping("/products")
	public List<Product> getProducts(){
		return products;
	}
}
