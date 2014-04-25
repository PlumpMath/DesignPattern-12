package com.subrata.builder;

/*
 * High end STB box where Hard disk is there , so that you can do all disk related operation.
 */
public class STBPVRProfile implements STBProfileBuilder {

	@Override
	public void buildBase() {
		System.out.println("**********Subrata :: Creating the base for Zapper Set top box.");
	}

	@Override
	public void addFeatures() {
		System.out.println("**********Subrata :: Adding Tuning to Movie/Sports etc channel fetaure.");
		System.out.println("**********Subrata :: Put a channel to Reminder mode feature .");
		System.out.println("**********Subrata :: Record any channel feature .");
		System.out.println("**********Subrata :: Down any Moview from ShowCase .");
	}

	@Override
	public void printAllFeature() {
		System.out.println("**********Subrata :: STB Zapper has Tuning feature .");
		System.out.println("**********Subrata :: STB Zapper has Reminder feature .");
		System.out.println("**********Subrata :: STB Zapper has Recording feature .");
		System.out.println("**********Subrata :: STB Zapper has Download feature .");

	}

	@Override
	public void addNetworkConnection() {
		System.out.println("**********Subrata :: Add Satellite Connectivity...");
		System.out.println("**********Subrata :: Add Internet Connectivity...");
	}

}
