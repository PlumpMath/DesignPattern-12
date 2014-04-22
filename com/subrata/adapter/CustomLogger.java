package com.subrata.adapter;

public interface CustomLogger {
	public static final int LOG_TYPE_TEXT = 1;
	public static final int LOG_TYPE_PRINTER = 2;
	public static final int LOG_TYPE_MAIL = 3;
	
	public void writeToLogFile(int type, String transaction);   
}
