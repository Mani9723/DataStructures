package Searching;

public class BinarySearch<T>
{
	public <T extends Comparable<T>> int binarySearch(T target, T array[])
	{
		int left = 0;
		int right = array.length-1;
		while ((left < right)) {
			int midPoint = (int)Math.floor((left+right)/2);
			if (array[midPoint].compareTo(target) < 0){
				left = midPoint + 1;
			}
			else if (array[midPoint].compareTo(target) > 0){
				right = midPoint - 1;
			}else {
				return midPoint;
			}
		}
		return -1;
	}
}
