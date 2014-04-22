package com.subrata.adapter;

public class MediaAdapter implements CustomLogger {

	EnhancedLogger enhancedLogger;

	public MediaAdapter(int resourceType) {
		if (resourceType == CustomLogger.LOG_TYPE_PRINTER) {
			enhancedLogger = new PrinterSender();
		} else if (resourceType == CustomLogger.LOG_TYPE_MAIL) {
			enhancedLogger = new MailSender();
		}
	}

	@Override
	public void writeToLogFile(int toResourceType, String token) {
		if (toResourceType == CustomLogger.LOG_TYPE_PRINTER) {
			enhancedLogger.sendToPrinter(token);
		} else if (toResourceType == CustomLogger.LOG_TYPE_MAIL) {
			enhancedLogger.sendMailToAdmin(token);
		}
	}
}
