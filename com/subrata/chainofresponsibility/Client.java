package com.subrata.chainofresponsibility;
/**
 * Client for checking who can handle this message.
 * @author Subrata Saha.
 *
 */
public class Client {

	
	public static void main(String[] args) {
		Logger chain = new STDOutLogger(Logger.DEBUG);
		 
        Logger logger1 = new EmailLogger(Logger.NOTICE);
        chain.setNext(logger1);
 
        // Handled by StdoutLogger (level = 7)
        chain.message("Debug message", Logger.DEBUG);
 
        // Handled by StdoutLogger and EmailLogger (level = 5)
        chain.message("Notice message", Logger.NOTICE);
	}
}
