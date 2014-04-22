package com.subrata.factory;


public class JMSHTTPConnection implements Connection  {

	// Here this string object can be of type actual Connection object.
	String connObject = null;
	
	public JMSHTTPConnection(){
		connObject = "JMS http connection.";
	}
	
	@Override
	public String getConnection() {
		return connObject;
	}

}
