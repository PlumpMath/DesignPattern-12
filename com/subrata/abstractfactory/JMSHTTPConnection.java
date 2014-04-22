package com.subrata.abstractfactory;

public class JMSHTTPConnection implements JMSConnection {

	@Override
	public void createJMSConnection() {
		System.out
				.println("**********Subrata :: JMSHTTPConnection.createJMSConnection()");
	}
}
