package com.subrata.adapter;

public class PrinterSender implements EnhancedLogger {
	@Override
	public void writeToDevice(String token) {
		System.out.println("**********Subrata :: Sending the text ->" + token
				+ "<- to HP Printer...");
	}
}
