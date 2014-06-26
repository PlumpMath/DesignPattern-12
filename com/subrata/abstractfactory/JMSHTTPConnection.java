package com.subrata.abstractfactory;

public class JMSHTTPConnection implements IJMSConnection {

	@Override
	public void createJMSConnection() {
		System.out
				.println("**********Subrata :: JMSHTTPConnection.createJMSConnection()");
	}
}
