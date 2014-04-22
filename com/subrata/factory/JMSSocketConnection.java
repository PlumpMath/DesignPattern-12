package com.subrata.factory;

public class JMSSocketConnection implements Connection {

	// Here this string object can be of type actual Connection object.
	String connObject = null;

	public JMSSocketConnection() {
		connObject = "JMS socket connection.";
	}

	@Override
	public String getConnection() {
		return connObject;
	}

}
