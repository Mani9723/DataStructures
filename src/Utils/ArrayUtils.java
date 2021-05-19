package Utils;

import java.util.Random;

public class ArrayUtils
{
	public static Integer[] generateIntArray(int length, int min, int max)
	{
		Integer[] array = new Integer[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextInt(max)+min;
		}
		return array;
	}

	public static Character[] generateCharArray(int length, int min, int max)
	{
		Character[] array = new Character[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = (char)(new Random().nextInt(max)+min);
		}
		return array;
	}

	public static Float[] generateFloatArray(int length)
	{
		Float[] array = new Float[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextFloat();
		}
		return array;
	}

	public static Double[] generateDoubleArray(int length)
	{
		Double[] array = new Double[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextDouble();
		}
		return array;
	}

	public static Long[] generateLongArray(int length)
	{
		Long[] array = new Long[length];
		for (int i = 0; i < array.length; i++) {
			array[i] = new Random().nextLong();
		}
		return array;
	}

	public static <T> void printArray(T[] arr)
	{
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}
		System.out.println();

	}

	public static <T extends Comparable<T>> boolean isSorted(T[] list)
	{
		for (int i = 1; i < list.length; i++) {
			if(list[i].compareTo(list[i-1]) < 0) {
				return false;
			}
		}
		return true;
	}
}
