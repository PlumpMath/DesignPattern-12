package com.subrata.abstractfactory;

public class JMSSocketConnection implements JMSConnection {

	@Override
	public void createJMSConnection() {
		System.out
				.println("**********Subrata :: JMSSocketConnection.createJMSConnection()");
	}
}
