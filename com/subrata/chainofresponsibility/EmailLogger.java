package com.subrata.chainofresponsibility;

public class EmailLogger extends Logger {

	 public EmailLogger(int mask) {
	     this.mask = mask;
	 }
	
	@Override
	protected void writeMessage(String msg) {
		System.out.println("****** Subrata -> EmailLogger is writing ::"+msg);
	}

}
