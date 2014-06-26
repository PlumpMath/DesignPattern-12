package com.subrata.abstractfactory;

public class JMSSocketConnection implements IJMSConnection {

	@Override
	public void createJMSConnection() {
		System.out
				.println("**********Subrata :: JMSSocketConnection.createJMSConnection()");
	}
}
