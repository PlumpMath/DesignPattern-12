package com.subrata.j2EEPatterns.presentation;
/**
 * We want to avoid protocol specific system information outside its relevant context.
 * 
 * Client can be HTTP/Rest/RPC and we take out the required information from the request
 * and create a context object by setting required value and send it to business layer.
 * 
 * Typically ContextFactory creates a ContextObject.  
 * It also does the protocol handling and can talk to validator class to do the server side validation for each request.
 * 
 * @author Subrata Saha.
 *
 */
public class ContextObject {

}
