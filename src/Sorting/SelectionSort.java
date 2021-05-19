package Sorting;

import java.util.Random;

public class SelectionSort
{
	public <T extends Comparable<T>> void sort(T[] list)
	{
		int minIndex;

		for(int i = 0; i < list.length; i++){
			minIndex = i;
			for(int j = i+1; j<list.length;j++){
				if(list[j].compareTo(list[minIndex]) < 0) {
					minIndex = j;
				}
			}
			T temp = list[i];
			list[i] = list[minIndex];
			list[minIndex] = temp;
		}
	}

	public static void main(String[] args)
	{
		Character[] a = new Character[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = (char)(new Random().nextInt(26)+97);
			System.out.print(a[i] + " ");
		}
		new SelectionSort().sort(a);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}

	
}
