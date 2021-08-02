package com.viru.rest.webservices.restfulwebservices.filtering;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

//to ignore multiple fields
@JsonIgnoreProperties(value = {"field2","field3"})
public class SomeBean {
	
	private String field1;
	private String field2;
	
	//to ignore particular field
	//@JsonIgnore
	private String field3;
	
	
	public SomeBean(String field1, String field2, String field3) {
		super();
		this.field1 = field1;
		this.field2 = field2;
		this.field3 = field3;
	}
	public String getField1() {
		return field1;
	}
	public String getField2() {
		return field2;
	}
	public String getField3() {
		return field3;
	}
	
	
}
