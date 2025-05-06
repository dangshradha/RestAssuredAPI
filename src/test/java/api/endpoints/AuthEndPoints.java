package api.endpoints;

import static io.restassured.RestAssured.given;
import api.payload.UserAuth;
import io.restassured.response.Response;


//Perfom Auth login operation on User API
public class AuthEndPoints {
	
	public static Response loginUser(UserAuth userpayload_auth)
	{		
		                   Response response=given()
									.contentType("application/json")
									.body(userpayload_auth)
						   .when()
									.post(Routes.post_auth_url);
						   return response;
		
	}
	

}
