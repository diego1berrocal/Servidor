package comun;

import java.io.Serializable;

public class Profile implements Serializable {
	private String username;
	private String password;


	public Profile(String username,String password){
		this.username = username;
		this.password = password;
		
		
		
	}

	public String getUsername() {
		return username;
	}

	public String getPassword() {
		return password;
	}


	
}
