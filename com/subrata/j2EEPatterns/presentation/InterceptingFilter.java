package com.subrata.j2EEPatterns.presentation;
/**
 * We want to intercept and manipulate a request and a response before and after the request is processed.
 * (e.g - we want to check various encoding or convert request specific object to application specific object.)
 * 
 * Typically request is handled by a FilterManager.
 * FilterManager delegate the responsibility to different Filter in a chain to be processed.
 * It may create a context object understood by application.
 * Then it gets redirected to the next guy.
 * 
 * @author Subrata Saha.
 *
 */
public class InterceptingFilter {

}
