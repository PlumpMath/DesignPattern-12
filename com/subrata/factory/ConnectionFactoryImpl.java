package com.subrata.factory;

public class ConnectionFactoryImpl implements ConnectionFactory  {
	
	private static ConnectionFactoryImpl  instance= new ConnectionFactoryImpl();
	
	private ConnectionFactoryImpl(){
		
	}
	
	public static ConnectionFactoryImpl getInstance(){
		return instance;
	}
	

	public Connection createConnection(int type) {
		Connection connection = null;
		switch (type) {
		case Connection.TYPE_HTTP:
			connection = new JMSHTTPConnection();
			break;
		case Connection.TYPE_SOCKET:
			connection = new JMSSocketConnection();
			break;
		}
		return connection;
	}

}
