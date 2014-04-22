package com.subrata.singleton;

public class Client {
	public static void main(String[] args) {
		QuickSingleton instance1 = QuickSingleton.getInstance();
		LazySingleton instance2 = LazySingleton.getInstance();
	}
}
