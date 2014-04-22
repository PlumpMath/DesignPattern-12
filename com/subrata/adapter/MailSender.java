package com.subrata.adapter;

public class MailSender implements EnhancedLogger {
	@Override
	public void writeToDevice(String token) {
		System.out
				.println("**********Subrata :: Sending mail to admin@hp.com with text ->"
						+ token + "<-");
	}
}
