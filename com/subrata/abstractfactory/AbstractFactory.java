package com.subrata.abstractfactory;

public abstract class AbstractFactory {
	
	public static final int TYPE_DB = 1;	
	public static final int TYPE_JMS = 2;
	
	public static final int TYPE_JMS_SOCKET = 3;
	public static final int TYPE_JMS_HTTP = 4;
	
	public static final int TYPE_DB_MYSQL = 5;
	public static final int TYPE_DB_ORACLE = 6;

	abstract DBConnection getDataBaseConnection(int dbType);
	abstract JMSConnection getJMSConnection(int jmsType); 
}
