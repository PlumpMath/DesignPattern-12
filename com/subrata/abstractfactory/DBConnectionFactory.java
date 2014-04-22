package com.subrata.abstractfactory;

public class DBConnectionFactory extends AbstractFactory {

	@Override
	public JMSConnection getJMSConnection(int dbType) {
		System.out
				.println("**********Subrata :: DBConnectionFactory.getJMSConnection( NOT SUPPORTED )");
		return null;
	}

	@Override
	public DBConnection getDataBaseConnection(int jmsType) {
		DBConnection conn = null;
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
