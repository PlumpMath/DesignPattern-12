package com.subrata.strategy;

/*
 * Factory class to retunr the correct strategy type based on type.
 */
public class SortFactory {
	
	public static final int INSERTIONSORT_STRATEGY = 1;
	public static final int QUICKSORT_STRATEGY = 2;
	private static SortFactory factory = new SortFactory();
	
	private SortFactory(){
		
	}
	
	public static SortFactory getInstance(){
		return factory;
	}
	
	public SortingStrategy getStrategy(int type){
		SortingStrategy strategy = null;
		switch(type){
		case INSERTIONSORT_STRATEGY :
			strategy = new InsertionSortStrategy();
			break;
		case QUICKSORT_STRATEGY :
			strategy = new QuickSortStrategy();
			break;
		}
		return strategy;
	}

}
