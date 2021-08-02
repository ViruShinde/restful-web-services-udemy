package com.viru.rest.webservices.restfulwebservices.filtering;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FilteringController {

	@GetMapping("/filtering")
	public SomeBean retriveSomeBean() {
		return new SomeBean("valu1","valu2","valu3");
	}
	
	@GetMapping("/filtering-list")
	public List<SomeBean> retriveListOfSomeBean() {
		return Arrays.asList(new SomeBean("valu1","valu2","valu3"),
				new SomeBean("valu1","valu2","valu3"),
				new SomeBean("valu1","valu2","valu3"));
	}
	
}
