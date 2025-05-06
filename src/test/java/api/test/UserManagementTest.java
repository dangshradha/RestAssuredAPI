package api.test;
import api.utilities.*;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import api.endpoints.AuthEndPoints;
import api.endpoints.UserEndPoint;
import api.payload.AddressClass;
import api.payload.Name;
import api.payload.User;
import api.payload.UserAuth;
import io.restassured.response.Response;
import jdk.internal.net.http.common.Log;

//This class contains test methods of User Management Module
public class UserManagementTest  {
	
	Faker faker;
	User userpayload;
	UserAuth userpayload_auth;
	AddressClass address;
	Name  name;
	String auth_userName;
	String auth_passWord;
	
	@BeforeClass
	public void setupData()
	{
		
		UserUtility userutil=new UserUtility();
		userutil.address_Class();
		userutil.name();
		
		//userutil.auth();
	
		userpayload=userutil.addUser();
		System.out.println(userpayload.getUsername());
		System.out.println(userpayload.getPassword());
		userpayload_auth=userutil.addAuth(userpayload.getUsername().toString(),userpayload.getPassword().toString());
		System.out.println(userpayload_auth.getUsername());
		System.out.println(userpayload_auth.getPassword());
	}
	
	@Test (priority=1)
	public void postUser()  
	{
		Response response=UserEndPoint.createUser(userpayload);
		try {
		Assert.assertEquals(response.getStatusCode(),200);
		Assert.assertEquals(response.jsonPath().get("username").toString(),userpayload.getUsername());
		}catch(Exception e) {
			System.out.println(e.toString());
		}
		response.then().log().all();
	}
	
	@Test (priority=2)
	public void postUserAuth()  
	{
		Response response=AuthEndPoints.loginUser(userpayload_auth);
		try {
		Assert.assertEquals(response.getStatusCode(),200);
		}catch(Exception e){
			System.out.println(e.toString());
		}
		response.then().log().all();
	}
}
