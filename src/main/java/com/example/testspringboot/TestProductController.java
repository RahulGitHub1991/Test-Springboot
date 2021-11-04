package com.example.testspringboot;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestProductController {

	@GetMapping(value = "/product-details", produces = MediaType.APPLICATION_JSON_VALUE)
	public List<ProductDetails> getProductDetails() {
		List<ProductDetails> list = new ArrayList<ProductDetails>();
		list.add(new ProductDetails("Tea", 1));
		list.add(new ProductDetails("Coffee", 2));
		list.add(new ProductDetails("Gold", 3));
		return list;
	}

	@GetMapping(value = "/cities", produces = MediaType.APPLICATION_XML_VALUE)
	public Cities findCities() {

		City c1 = new City(1L, "Mumbai", 432000);
		City c2 = new City(2L, "Pune", 1759000);
		City c3 = new City(3L, "Nashik", 1280000);
		City c4 = new City(4L, "Aurangabad", 1280000);
		City c5 = new City(5L, "Navi Mumbai", 1280000);

		Set<City> list = new HashSet<City>();
		list.add(c1);
		list.add(c2);
		list.add(c3);
		list.add(c4);
		list.add(c5);

		var cities = (Set<City>) list;
		var mycities = new Cities();
		mycities.setCities(cities);

		return mycities;
	}

}
