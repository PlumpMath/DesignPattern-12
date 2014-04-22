package com.subrata.abstractfactory;
/**
 * 
 * What it is : Its a creational pattern for creating factory of related items but it is factory of factory. 
 *  e.g first factory gives us related objects another gives us sub category objects of related objects.
 *
 * When to use : 
 *
 * Example description : We have to create Database and JMS connection object where there can be multiple database/jms type supported.
 * Here we can create MySQL/Oracle/JMS HTTP/JMS socket connection object from the same factory class. Here the client wont be affected
 * if new kind connection is added in future.
 *
 * @author Subrata Saha (saha.subrata@gmail.com)
 *
 */
public class Client {
	public static void main(String[] args) {
		AbstractFactory dbConnFactory = ConnectionFactory.getInstance().getFactory(AbstractFactory.TYPE_DB); 
		DBConnection mySqlConnection = dbConnFactory.getDataBaseConnection(AbstractFactory.TYPE_DB_MYSQL);
		mySqlConnection.createDBConnection();

		DBConnection oracleConnection = dbConnFactory.getDataBaseConnection(AbstractFactory.TYPE_DB_ORACLE);
		oracleConnection.createDBConnection();

		AbstractFactory jmsConnFactory = ConnectionFactory.getInstance().getFactory(AbstractFactory.TYPE_JMS);
		JMSConnection jmsHTTPconnection = jmsConnFactory.getJMSConnection(AbstractFactory.TYPE_JMS_HTTP);
		jmsHTTPconnection.createJMSConnection();

		JMSConnection jmsSocketConnection = jmsConnFactory.getJMSConnection(AbstractFactory.TYPE_JMS_SOCKET);
		jmsSocketConnection.createJMSConnection();
	}
}
