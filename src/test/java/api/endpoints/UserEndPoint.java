package api.endpoints;

import api.payload.User;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import static io.restassured.RestAssured.given;
import static io.restassured.matcher.RestAssuredMatchers.*;
import static org.hamcrest.Matchers.*;


//Created to perform create post operation on user API
public class UserEndPoint {
	
	public static Response createUser(User payload)
	{		
		                   Response response=given()
									.contentType(ContentType.JSON)
									.accept(ContentType.JSON)
									.body(payload)
						   .when()
									.post(Routes.post_user_url);
		                    response.then().log().all();
		                    return response;
		                    
						  
		
	}
	
	
	

}
