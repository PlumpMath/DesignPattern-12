package com.subrata.singleton;

public class Client {
	public static void main(String[] args) {
		@SuppressWarnings("unused")
		QuickSingleton instance1 = QuickSingleton.getInstance();
		@SuppressWarnings("unused")
		LazySingleton instance2 = LazySingleton.getInstance();
	}
}
