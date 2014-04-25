package com.subrata.builder;

/**
 * 
 * What it is : It a creational pattern where we construct the object in
 * multiple phase, not like factory where we create in single phase.
 * 
 * When to use :
 * 
 * Example description : We ate trying a create a profile dynamically. Set top box has different kinds of profile.
 * Zapper means only channel view facility , PVR box means they have hard disk in it so you can record content or
 * download a movie using internet connection with in the box.
 * 
 * Let see how to create a Zapper and PVR profile step by step.
 * 
 * @author Subrata Saha (saha.subrata@gmail.com)
 * 
 */
public class Client {
	public static void main(String[] args) {
		STBProfileGenerator generator1 = new STBProfileGenerator(new STBZapperProfile());
		generator1.generateProfile();
		
		STBProfileGenerator generator2 = new STBProfileGenerator(new STBPVRProfile());
		generator2.generateProfile();
	}
}
