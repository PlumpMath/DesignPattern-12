package com.subrata.abstractfactory;

public class MySQLDBConnection implements IDBConnection {

	@Override
	public void createDBConnection() {
		System.out
				.println("**********Subrata :: MySQLDBConnection.createDBConnection()");
	}
}
