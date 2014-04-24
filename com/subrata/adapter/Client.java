package com.subrata.adapter;
/**
 * 
 * What it is : It is a bridge between two different interface.
 *
 *
 * Example description : After Successfully booking the ticker the web site wants to log the transaction details to
 * 1) Log file using Apache Log4J 2) Send the token for printer (HP printer) 3) Send a mail to the admin.
 * 
 * Now Functionality 1 was achieved but later on they added addition functionality of sending mail and printing the doc. 
 *
 *  
 * @author Subrata Saha (saha.subrata@gmail.com)
 *
 */
public class Client {
	
	public static void main(String[] args) {
		TransactionWriter writer = new TransactionWriter();
		writer.writeToLogFile(CustomLogger.LOG_TYPE_TEXT, "My name is Subrata");
	    writer.writeToLogFile(CustomLogger.LOG_TYPE_PRINTER, " Ticket is confirmed !!");
	    writer.writeToLogFile(CustomLogger.LOG_TYPE_MAIL, " Hello admin, Subrata has booked the ticket finally !!");
	    writer.writeToLogFile(23, "Lets try hacking the system.");
	}
	
}
