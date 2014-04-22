package com.subrata.abstractfactory;

public class MySQLDBConnection implements DBConnection {

	@Override
	public void createDBConnection() {
		System.out
				.println("**********Subrata :: MySQLDBConnection.createDBConnection()");
	}
}
