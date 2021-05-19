package Utils;

public class Exchange
{
	public static <T extends Comparable<T>> void exchange(T[] a, int first, int second)
	{
		T temp = a[first];
		a[first] = a[second];
		a[second] = temp;
	}
}
