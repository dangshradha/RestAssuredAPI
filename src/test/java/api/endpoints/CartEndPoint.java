package api.endpoints;

import static io.restassured.RestAssured.given;

import api.payload.Cart;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

//Created to perform CRUD(Create, Read, Update and Delete ) operations on Carts API.
public  class CartEndPoint {

		public  static Response createCart(Cart payload) {
		
				Response response=given()
						 .contentType(ContentType.JSON)
						 .body(payload)
				.when()
						 .post(Routes.post_cart_url);
				return response;
}

public static Response readCart(int id) {
	
			    Response response=given()
				       	 .pathParam("id", id)
					 
			    .when()
					     .get(Routes.get_cart_url);
			    return response;
}

public static Response updateCart(Cart payload,int id) {
	
			   Response response=given()
					    .contentType(ContentType.JSON)
					    .pathParam("id", id)
					    .body(payload)
			   .when()
					    .post(Routes.put_cart_url);
			   return response;
}

public static Response deleteCart(Cart payload,int id) {
	
			   Response response=given()
				 	    .contentType(ContentType.JSON)
					    .pathParam("id", id)
					 
			   .when()
					    .post(Routes.delete_cart_url);
			   return response;
}

}
