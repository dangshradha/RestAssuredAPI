package api.payload;

//POJO class for Auth API
public class UserAuth {
	
	    private String username;
	    private String password;


	 


		public UserAuth(String usernameAuth, String passwordAuth) {
			// TODO Auto-generated constructor stub
			this.username=usernameAuth;
			this.password=passwordAuth;
		}



		

		

		public String getUsername() {
	        return username;
	    }

	    public void setUsername(String username) {
	        this.username = username;
	    }

	    public String getPassword() {
	        return password;
	    }

	    public void setPassword(String password) {
	        this.password = password;
	    }
	}