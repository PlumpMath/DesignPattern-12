package com.subrata.strategy;

/*
 * Util class to sort the int[]
 */
public class SortingUtility {
	private static final int INSERTIONSORT_THRESHOLD = 7;

	public static void sort(int[] array){
		if(array == null){
			return;
		}
		
		SortingStrategy strategy = null;
		
		if(array.length < INSERTIONSORT_THRESHOLD){
			strategy = SortFactory.getInstance().getStrategy(SortFactory.INSERTIONSORT_STRATEGY);
		}else{
			strategy = SortFactory.getInstance().getStrategy(SortFactory.QUICKSORT_STRATEGY);
		}
		
		strategy.sort(array);
	}
	
}
