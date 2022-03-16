package Searching;

import java.util.ArrayList;

public class LinearSearch<T>
{

	public <T extends Comparable<T>> int linearSearch(ArrayList<T> list, T target){
		int len = list.size();
		for (int i = 0; i < len; i++) {
			if(list.get(i).compareTo(target) == 0){
				return i;
			}
		}
		return -1;
	}

}
