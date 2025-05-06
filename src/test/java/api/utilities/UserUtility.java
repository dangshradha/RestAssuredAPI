package api.utilities;

import com.github.javafaker.Faker;



import api.payload.AddressClass;
import api.payload.Name;
import api.payload.User;
import api.payload.UserAuth;
import api.utilities.*;
import api.endpoints.UserEndPoint;
import api.payload.AddressClass;
import api.payload.Name;
import api.payload.User;

public class UserUtility{
	
   
    public AddressClass address_Class(){
		    String city=new Faker().address().city();
		    String street=new Faker().address().streetName();
		    int number=Integer.parseInt(new Faker().address().buildingNumber());
		    String zipcode=new Faker().address().zipCode();
		    return new AddressClass(city,street,number,zipcode);
    }
    
    public Name name(){
        String firstname=new Faker().name().firstName();
        String lastname=new Faker().name().lastName();
        return new Name(firstname,lastname);
    }
    
    public User addUser(){
        String email=new Faker().internet().emailAddress();
        String username=new Faker().name().username();
        String password=new Faker().internet().password();
        String phone=new Faker().phoneNumber().phoneNumber();
        return new User(email,username,password,phone,name(),address_Class());
    }
    public UserAuth addAuth(String username, String password) {
		 String username_auth=username;
		 String password_auth=password;
		 return new UserAuth(username_auth,password_auth);
	}
    
   
   }

