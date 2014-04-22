package com.subrata.adapter;

public class EnhancedLoggerAdapter implements CustomLogger {

	EnhancedLogger enhancedLogger;

	public EnhancedLoggerAdapter(int resourceType) {
		if (resourceType == CustomLogger.LOG_TYPE_PRINTER) {
			enhancedLogger = new PrinterSender();
		} else if (resourceType == CustomLogger.LOG_TYPE_MAIL) {
			enhancedLogger = new MailSender();
		}
	}

	@Override
	public void writeToLogFile(int toResourceType, String token) {
		enhancedLogger.writeToDevice(token);
	}
}
