package com.subrata.builder;

public class STBProfileGenerator { 
	private STBProfileBuilder mb;

	public STBProfileGenerator(STBProfileBuilder mb) {
		this.mb = mb; 
	}

	/**
	 * See Here we are creating the objects in multiple steps and the next steps may be dependent on previously steps.
	 */
	public void generateProfile() {
		mb.buildBase();
		mb.addConfiguration();
		mb.addFeatures();
		mb.addPlugins();
	}
};
