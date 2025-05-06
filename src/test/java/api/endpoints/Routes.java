package api.endpoints;

/*
 * Operation wise Routes declaration
 Base URL ----> https://fakestoreapi.com
 
 Create User (Post) : https://fakestoreapi.com/users
 Get User (Get): https://fakestoreapi.com/users/{username}
 Update User(Put): https://fakestoreapi.com/users/{username}
 Delete User(Delete) : https://fakestoreapi.com/users/{username}
 */

public class Routes {
	
	public static String base_url="https://fakestoreapi.com" ;
	
	//USER MODULE 
	public static String post_user_url=base_url+"/users" ;
	public static String get_user_url=base_url+"/users/{username}";
	public static String put_user_url=base_url+"/users/{username}";
	public static String delete_user_url=base_url+"/users/{username}";
	
	//Auth Module
	public static String post_auth_url=base_url+"/auth/login" ;
	
	//Product Module 
	public static String post_product_url=base_url+"/products" ;
	public static String get_product_url=base_url+"/products/{id}";
	public static String put_product_url=base_url+"/products/{id}";
	public static String delete_product_url=base_url+"/products/{id}";
	
	//Cart Module 
	public static String post_cart_url=base_url+"/carts" ;
	public static String get_cart_url=base_url+"/carts/{id}";
	public static String put_cart_url=base_url+"/carts/{id}";
	public static String delete_cart_url=base_url+"/carts/{id}";
	
	
}
