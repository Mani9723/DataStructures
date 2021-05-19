package Sorting;

import static Utils.ArrayUtils.isSorted;
import static Utils.ArrayUtils.printArray;
import static Utils.Exchange.exchange;

public class ShellSort
{

	private static <T extends Comparable<T>> void shellSort(T[] array)
	{
		int h = 1;
		int N = array.length;
		while( h < N/3) {
			h = 3*h + 1;
		}

		while(h >= 1) {
			for(int i = h; i < N; i++) {
				for(int j = i; j >= h; j -= h) {
					if(array[j].compareTo(array[j-h]) < 0){
						exchange(array,j,j-h);
					}
				}
			}
			h = h/3;
		}
	}


	public static <T extends Comparable<T>> void printAndSort(T[] list)
	{
		printArray(list);
		shellSort(list);
		printArray(list);
		System.out.println(isSorted(list));
	}

	public static void main(String[] args)
	{
		new SortingTests().testShellSort();
	}
}
