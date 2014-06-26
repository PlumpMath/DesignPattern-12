package com.subrata.abstractfactory;

public class DBConnectionFactory extends AbstractFactory {

	@Override
	public IJMSConnection getJMSConnection(int dbType) {
		System.out
				.println("**********Subrata :: DBConnectionFactory.getJMSConnection( NOT SUPPORTED )");
		throw new RuntimeException("JMSConnection not supported..");
	}

	@Override
	public IDBConnection getDataBaseConnection(int jmsType) {
		IDBConnection conn = null;
		switch (jmsType) {
		case AbstractFactory.TYPE_DB_MYSQL:
			conn = new MySQLDBConnection();
			break;
		case AbstractFactory.TYPE_DB_ORACLE:
			conn = new OracleDBconnection();
			break;
		}
		return conn;
	}
}
