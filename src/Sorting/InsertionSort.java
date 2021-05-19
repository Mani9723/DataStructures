package Sorting;

import java.util.Random;
import static Utils.Exchange.exchange;

public class InsertionSort
{

	public <T extends Comparable<T>> void sort(T[] list)
	{
		for(int i = 1; i < list.length; i++){
			for(int j = i-1; j >= 0; j--){
				if(list[j+1].compareTo(list[j])<0){
					exchange(list,j+1,j);
				}
			}
		}
	}

	public static void main(String[] args)
	{
		Character[] a = new Character[100];
		for (int i = 0; i < a.length; i++) {
			a[i] = (char)(new Random().nextInt(26)+97);
			System.out.print(a[i] + " ");
		}
		new InsertionSort().sort(a);
		System.out.println();
		for (int i = 0; i < a.length; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
