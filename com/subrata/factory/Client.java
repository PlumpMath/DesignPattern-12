package com.subrata.factory;

/**
 * 
 * What it is : Factory Pattern can be used to create a object by promoting decoupling.
 *
 * When to use : 
 *
 * Example description : In JMS ActiveMQ you can create different type of Connection e.g through socket or http
 * Here we will try to create a connection object based parameter which can come from client configuration.
 *
 * @author Subrata Saha (saha.subrata@gmail.com)
 *
 */
public class Client {
	
	public static void main(String[] args) {
		Connection conn = ConnectionFactoryImpl.getInstance().createConnection(Connection.TYPE_HTTP);
		String result = conn.getConnection();
		System.out.println("**********Subrata first connection ::"+result);
		
		conn = ConnectionFactoryImpl.getInstance().createConnection(Connection.TYPE_SOCKET);
		result = conn.getConnection();
		System.out.println("**********Subrata second connection ::"+result);
	}
	
}
