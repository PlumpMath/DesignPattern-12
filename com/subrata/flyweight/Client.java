package com.subrata.flyweight;

import java.util.Hashtable;

/**
 * 
 * What it is : Lightweight version of any object where full heavy object is not required.
 *
 * Example description : User wants to login to portal , for that we may create a cache of light weight of User object.
 * In this way we don't need to database every time user logs in and because user object is light weight so the cache will be optimum.
 * 
 * This may not be the solution for a big user base but giving an example to understand the concept.
 *
 * @author Subrata Saha (saha.subrata@gmail.com)
 *
 */
public class Client {
	
	Hashtable<String,UserFlyWeigth> cache = new Hashtable<>();
	
	public static void main(String[] args) {
		
		Client client = new Client();
		client.loadUserIntoCache();
		
		// during login we got the key
		String key = "firstName1.lastName1@gmail.com";
		if(client.cache.containsKey(key)){
			System.out.println("**********Subrata :: User id ::"+client.cache.get(key).getId()+" and password is ::"+client.cache.get(key).getPassword());
		}else{
			System.out.println("**********Subrata :: User "+key+" not found in our database !!");
		}
		
	}
	
	
	void loadUserIntoCache(){
		// Ideally we will read all the user from DB and load it in the cache.
		for(int i=0;i<5;i++){
			String email = "firstName"+(i+1)+".lastName"+(i+1)+"@gmail.com";
			String pword = "password"+(i+1);
			UserFlyWeigth obj = new UserFlyWeigth(email,pword,(i+1));
			cache.put(email, obj);
		}
	}

}
