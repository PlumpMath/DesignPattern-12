package com.subrata.flyweight;

public class UserFlyWeigth {
	User user = null;
	public UserFlyWeigth(String email,String Password,int id){
		user = new User();
		user.setEmail(email);
		user.setPassword(Password);
		user.setId(id);
	}
	
	public String getEmail(){
		String mail = null;
		if(user != null){
			mail = user.getEmail();
		}
		return mail;
	}
	
	public String getPassword(){
		String password = null;
		if(user != null){
			password = user.getPassword();
		}
		return password;
	}
	
	public int getId(){
		int id = -1;
		if(user != null){
			id = user.getId();
		}
		return id;
	}
	
}
