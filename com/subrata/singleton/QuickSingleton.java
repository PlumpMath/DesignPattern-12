package com.subrata.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

public class QuickSingleton implements Serializable {
	private static final long serialVersionUID = 1L;
	private static QuickSingleton instance = new QuickSingleton();

	private QuickSingleton() {

	}

	public static QuickSingleton getInstance() {
		return instance;
	}

	/**
	 * Will save from creating multiple instance when de serialized.
	 * 
	 * @return
	 * @throws ObjectStreamException
	 */
	public Object readResolve() throws ObjectStreamException {
		return instance;
	}
	
}
