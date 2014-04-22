package com.subrata.abstractfactory;



public class ConnectionFactory {

	private static ConnectionFactory instance = new ConnectionFactory();

	private ConnectionFactory() {

	}

	public static ConnectionFactory getInstance() {
		return instance;
	}

	public AbstractFactory getFactory(int type) { 
		AbstractFactory factory = null;
		switch (type) {
		case AbstractFactory.TYPE_DB:
			factory = new DBConnectionFactory();
			break;
		case AbstractFactory.TYPE_JMS:
			factory = new JMSConnectionFactory();
			break;
		}
		return factory;
	}
}
