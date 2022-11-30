package Utils;

import java.util.Arrays;

public class ProductArray
{
	public static int[] prodArray(int[] arr)
	{
		int zeroCount = 0;
		int zeroIndex = -1;
		int totalProduct = 1;

		int[] productArray = new int[arr.length]; // automatically 0 initialized

		for (int i = 0; i < arr.length; i++) {
			if(arr[i] == 0) {
				zeroCount++;
				if(zeroCount > 1) { // multiple zeros
					return productArray; // return 0 array
				}
				zeroIndex = i; // keep zero index so that it easily can be used
			}else {
				totalProduct *= arr[i]; // calculated total product
			}
		}
		if(zeroCount == 1){ // single zero, so only index with 0 has the product
			productArray[zeroIndex] = totalProduct;
		}else{
			for (int i = 0; i < productArray.length; i++) { // non zero array
				productArray[i] = totalProduct/arr[i];

			}
		}

		return productArray;
	}

	public static void main(String[] args)
	{
		int[] arr1 = {1,2,3,4};
		int[] arr2 = {2,5,6,9};
		int[] arr3 = {2,-8,0,3};
		int[] arr4 = {0,-8,0,3};
		int[] arr5 = {-1,-2,-3,-4};

		System.out.println(Arrays.toString(prodArray(arr1)));
		System.out.println(Arrays.toString(prodArray(arr2)));
		System.out.println(Arrays.toString(prodArray(arr3)));
		System.out.println(Arrays.toString(prodArray(arr4)));
		System.out.println(Arrays.toString(prodArray(arr5)));
	}
}
