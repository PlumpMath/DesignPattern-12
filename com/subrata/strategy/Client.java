package com.subrata.strategy;

/**
 * 
 * What it is : Changing the algorithm in run time.
 * 
 * When to use : When we know that based on input variable the calculation of
 * outcome may vary , that time we should use this design pattern.
 * 
 * Example description : Based on the size of input int[] array we will sort the
 * array either by Insertion sort or Quick sort.
 * 
 * @author Subrata Saha (saha.subrata@gmail.com)
 * 
 */
public class Client {
	public static void main(String[] args) {
         int[] arr1 = {1,2,3,4};
         SortingUtility.sort(arr1);
         
         int[] arr2 = {1,2,3,4,5,6,7,8,9};
         SortingUtility.sort(arr2);
	}
}
