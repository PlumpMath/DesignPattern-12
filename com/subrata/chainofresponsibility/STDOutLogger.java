package com.subrata.chainofresponsibility;

public class STDOutLogger extends Logger {
	
	public STDOutLogger(int mask){
		this.mask = mask;
	}

	@Override
	protected void writeMessage(String msg) {
		System.out.println("****** Subrata -> STDOutLogger wrting ::"+msg);
	}

}
