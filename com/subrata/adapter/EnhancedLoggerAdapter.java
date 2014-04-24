package com.subrata.adapter;
/*
 * The rule is simple
 * A wants to talk with B but they are different interface.
 * Write Adapter - 
 *   1) Which implement A's interface. [in this case CustomLogger]
 *   2) Keep B's interface as the property of adapter [in this case EnhancedLogger]
 *   3) Now A wants to call B -> It calls Adapter and adapter internally calls B using B's interface stored in adapter.
 * 
 */
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
