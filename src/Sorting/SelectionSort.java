package Sorting;

import java.util.Random;
import static Utils.Exchange.exchange;
import static Utils.ArrayUtils.*;


public class SelectionSort
{
	private static <T extends Comparable<T>> void selectionSort(T[] list)
	{
		int minIndex;

		for(int i = 0; i < list.length; i++){
			minIndex = i;
			for(int j = i+1; j<list.length;j++){
				if(list[j].compareTo(list[minIndex]) < 0) {
					minIndex = j;
				}
			}
			exchange(list,i,minIndex);
		}
	}

	public static <T extends Comparable<T>> void printAndSort(T[] list)
	{
		printArray(list);
		selectionSort(list);
		printArray(list);
		System.out.println(isSorted(list));
	}

	public static void main(String[] args)
	{
		new SortingTests().testSelectionSort();

	}

	
}
