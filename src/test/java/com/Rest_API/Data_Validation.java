package com.Rest_API;

import org.junit.Assert;
import org.junit.Test;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class Data_Validation {
	
	@Test
	public void data_Validate() {
		
		RestAssured.baseURI = "https://reqres.in/";
		
		RequestSpecification request = RestAssured.given();
		
		Response response = request.get("api/users?page=2");
		
		String json = response.asString();
		
		System.out.println(json);
		
		int statusCode = response.getStatusCode();
		
		System.out.println("Status Code : "+statusCode);
		
		Assert.assertEquals(200, statusCode);
		
		System.out.println("Data Validation");
	
	}
}
