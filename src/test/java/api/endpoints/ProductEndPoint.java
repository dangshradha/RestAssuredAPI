package api.endpoints;

import api.payload.Product;
import static io.restassured.RestAssured.given;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

//Created to perform CRUD(Create, Read, Update and Delete ) operations on Products API.
public class ProductEndPoint {
	
		public static Response createProduct(Product payload) {
				
				Response response=given()
						 .contentType(ContentType.JSON)
						 .body(payload)
				.when()
						 .post(Routes.post_product_url);
				return response;
		}
		
		public static Response readProduct(int id) {
			
			    Response response=given()
				       	 .pathParam("id", id)
					 
			    .when()
					     .get(Routes.get_product_url);
			    return response;
	   }
		
		public static Response updateProduct(Product payload,int id) {
			
			   Response response=given()
					    .contentType(ContentType.JSON)
					    .pathParam("id", id)
					    .body(payload)
			   .when()
					    .post(Routes.put_product_url);
			   return response;
	   }
		
        public static Response deleteProduct(Product payload,int id) {
			
			   Response response=given()
				 	    .contentType(ContentType.JSON)
					    .pathParam("id", id)
					 
			   .when()
					    .post(Routes.delete_product_url);
			   return response;
	   }
		

}
