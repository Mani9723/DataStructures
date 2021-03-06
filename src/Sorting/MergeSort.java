package Sorting;

import static Utils.ArrayUtils.isSorted;
import static Utils.ArrayUtils.printArray;

public class MergeSort
{

	private static Comparable[] aux; // auxiliary array for merges

	public void sort(Comparable[] a)
	{
		aux = new Comparable[a.length]; // Allocate space just once.
		sort(a, 0, a.length - 1);
	}
	private static void sort(Comparable[] a, int lo, int hi)
	{ // Sort a[lo..hi].
		if (hi <= lo) return;
		int mid = lo + (hi - lo)/2;
		sort(a, lo, mid); // Sort left half.
		sort(a, mid+1, hi); // Sort right half.
		merge(a, lo, mid, hi); // Merge results (code on page 271).
	}

	public static void merge(Comparable[] a, int lo, int mid, int hi)
	{ // Merge a[lo..mid] with a[mid+1..hi].
		int i = lo, j = mid+1;
		for (int k = lo; k <= hi; k++) // Copy a[lo..hi] to aux[lo..hi].
			aux[k] = a[k];
		for (int k = lo; k <= hi; k++) // Merge back to a[lo..hi].
			if (i > mid) a[k] = aux[j++];
			else if (j > hi ) a[k] = aux[i++];
			else if (aux[j].compareTo(aux[i]) < 0) a[k] = aux[j++];
			else a[k] = aux[i++];
	}

	public static <T extends Comparable<T>> void printAndSort(T[] list)
	{
		printArray(list);
		new MergeSort().sort(list);
		printArray(list);
		System.out.println(isSorted(list));
	}

	public static void main(String[] args)
	{
		new SortingTests().testMergeSort();
	}
}
