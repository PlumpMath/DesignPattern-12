package com.subrata.abstractfactory;

public class OracleDBconnection implements IDBConnection {

	@Override
	public void createDBConnection() {
		System.out
				.println("**********Subrata :: OracleDBconnection.createDBConnection()");
	}
}
