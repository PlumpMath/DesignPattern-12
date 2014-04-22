package com.subrata.singleton;

import java.io.ObjectStreamException;
import java.io.Serializable;

/*
 * This implementation is useful when we want to load the class lazily.
 */
public class LazySingleton implements Serializable {

	private static final long serialVersionUID = 1L;
	private static LazySingleton instance = null;
	
	private LazySingleton(){
		
	}
	
	public static LazySingleton getInstance(){
		return StaticHolder.getLazySingleton();
	}
	
	/**
	 * Will save from creating multiple instance when de serialized.
	 * @return
	 * @throws ObjectStreamException
	 */
	public Object readResolve() throws ObjectStreamException{
		return instance;
	}
	
	/*
	 * StaticHolder class to load the instance of the class lazily..
	 */
	static class StaticHolder {
		 static LazySingleton getLazySingleton(){  
			if(instance == null){
				instance = new LazySingleton();
			}
			return instance;
		}
	}
	
}
