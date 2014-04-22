package com.subrata.factory;


public interface Connection {
	public static final int TYPE_HTTP = 1;
	public static final int TYPE_SOCKET = 2;
	
	// Here the return type will be actual object interface typw which we are interested in e.g ActiveMQConnection
	public String getConnection();
}
