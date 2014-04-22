package com.subrata.abstractfactory;

public class OracleDBconnection implements DBConnection {

	@Override
	public void createDBConnection() {
		System.out
				.println("**********Subrata :: OracleDBconnection.createDBConnection()");
	}
}
