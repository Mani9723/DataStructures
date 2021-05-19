package Sorting;

import java.util.Random;

import static Utils.ArrayUtils.*;
import static Utils.Exchange.exchange;

public class InsertionSort
{

	private static <T extends Comparable<T>> void insertionSort(T[] list)
	{
		for(int i = 1; i < list.length; i++){
			for(int j = i-1; j >= 0; j--){
				if(list[j+1].compareTo(list[j])<0){
					exchange(list,j+1,j);
				}
			}
		}
	}

	public static <T extends Comparable<T>> void printAndSort(T[] list)
	{
		printArray(list);
		insertionSort(list);
		printArray(list);
		System.out.println(isSorted(list));
	}

	public static void main(String[] args)
	{
		new SortingTests().testInsertionSort();

	}
}
