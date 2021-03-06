package Sorting;

import java.lang.reflect.Method;
import java.util.LinkedList;

import static Utils.ArrayUtils.*;


public class SortingTests
{
	private Integer[] list0;
	private Float[] list1;
	private Character[] list2;
	private Double[] list3;
	private Long[] list4;

	public void testSelectionSort()
	{
		getArrays();
		SelectionSort.printAndSort(list0);
		SelectionSort.printAndSort(list1);
		SelectionSort.printAndSort(list2);
		SelectionSort.printAndSort(list3);
		SelectionSort.printAndSort(list4);
	}

	public void testInsertionSort()
	{
		getArrays();
		InsertionSort.printAndSort(list0);
		InsertionSort.printAndSort(list1);
		InsertionSort.printAndSort(list2);
		InsertionSort.printAndSort(list3);
		InsertionSort.printAndSort(list4);
	}

	public void testShellSort()
	{
		getArrays();
		ShellSort.printAndSort(list0);
		ShellSort.printAndSort(list1);
		ShellSort.printAndSort(list2);
		ShellSort.printAndSort(list3);
		ShellSort.printAndSort(list4);
	}

	public void testMergeSort()
	{
		getArrays();
		MergeSort.printAndSort(list0);
		MergeSort.printAndSort(list1);
		MergeSort.printAndSort(list2);
		MergeSort.printAndSort(list3);
		MergeSort.printAndSort(list4);
	}

	private void getArrays()
	{
		list0 = generateIntArray(10,0,50);
		list1 = generateFloatArray(10);
		list2 = generateCharArray(10,65,26);
		list3 = generateDoubleArray(10);
		list4 = generateLongArray(10);

	}
}
