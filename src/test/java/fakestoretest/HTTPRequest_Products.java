package fakestoretest;

import static  io.restassured.RestAssured.*;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;

import java.util.function.Supplier;

import org.testng.annotations.Test;

import io.restassured.response.Response;
import jdk.internal.net.http.common.Log;

public class HTTPRequest_Products {
	int id;
	//@Test
	//Verifies response for get request (all products)
	void getBooks(){						
		
		given().
		when().
			get("https://fakestoreapi.com/products").
		then()
			.statusCode(200)
			.log().all();
	}
	
	//Verifies response for get request(specific id)
	@Test	
	void getBook() {                  
		
		given().
		when().
			get("https://fakestoreapi.com/products/"+id).   //need to change code for dynamic id
		then()
			.statusCode(200)
			.body("id",equalTo(21))
			.log().all();
	}
	
	//Verifies POST request response
	//@Test
	void postBook()
	{
		
		int id=given()
			.contentType("application/json")
			.body("{\r\n"
					+ "    \"title\": \"Test Playstation 5\",\r\n"
					+ "    \"price\": 500.2,\r\n"
					+ "    \"description\": \"Test Playstation console\",\r\n"
					+ "    \"image\": \"https://i.pravatar.cc\"\r\n"
					+ "}")
		
	   .when()
	   		.post("https://fakestoreapi.com/products")
	   		.jsonPath().getInt("id");
	  
		System.out.println(id);   
	}	 
}
