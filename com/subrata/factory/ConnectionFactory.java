package com.subrata.factory;

public interface ConnectionFactory {
	public Connection createConnection(int type);
}
