package com.subrata.abstractfactory;

public class JMSConnectionFactory extends AbstractFactory {

	@Override
	public IJMSConnection getJMSConnection(int jmsType) {
		IJMSConnection conn = null;
		switch (jmsType) {
		case AbstractFactory.TYPE_JMS_HTTP:
			conn = new JMSHTTPConnection();
			break;
		case AbstractFactory.TYPE_JMS_SOCKET:
			conn = new JMSSocketConnection();
			break;
		}
		return conn;
	}

	@Override
	IDBConnection getDataBaseConnection(int dbType) {
		System.out
				.println("**********Subrata :: JMSConnectionFactory.getDataBaseConnection( NOT SUPPORTED)");
		return null;
	}
}