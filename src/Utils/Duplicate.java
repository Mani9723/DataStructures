package Utils;

import java.util.HashSet;
import java.util.Set;

public class Duplicate
{

	public static int dupValue(int[] arr)
	{
		Set<Integer> set = new HashSet<>();
		for (int j : arr) {
			boolean result = set.add(j);
			if (!result) {
				return j;
			}
		}
		return -1;
	}

	public static void main(String[] args)
	{
		int[] arr = {1,3,2,4,5,3,8};
		System.out.println(dupValue(arr));;
	}
}

