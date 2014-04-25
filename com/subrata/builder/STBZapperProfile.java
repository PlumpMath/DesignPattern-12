package com.subrata.builder;

/*
 * Low end STB box where Hard disk is not there , so  you can do all basic operation like tuning to a channel etc.
 */
public class STBZapperProfile implements STBProfileBuilder {
    
	@Override
	public void buildBase() {
		System.out.println("**********Subrata :: Creating the base for Zapper Set top box.");		
	}

	@Override
	public void addFeatures() {
		System.out.println("**********Subrata :: Adding Tuning to Movie/Sports etc channel fetaure.");
		System.out.println("**********Subrata :: Put a channel to Reminder mode feature .");
	}

	@Override
	public void printAllFeature() {
		System.out.println("**********Subrata :: STB Zapper has Tuning feature .");
		System.out.println("**********Subrata :: STB Zapper has Reminder feature .");
	}

	@Override
	public void addNetworkConnection() {
		System.out.println("**********Subrata :: Add Satellite Connectivity...");		
	}

}
