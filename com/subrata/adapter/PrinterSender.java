package com.subrata.adapter;

public class PrinterSender implements EnhancedLogger{
	   @Override
	   public void sendToPrinter(String token) {
	      System.out.println("**********Subrata :: Sending the text ->"+ token +"<- to HP Printer...");		
	   }

	   @Override
	   public void sendMailToAdmin(String fileName) {
	      //do nothing
	   }
	}
