package Searching;

import java.util.List;

public class InterpolationSearch
{

	public int search(List<Integer> list, int target)
	{
		int high = list.size()-1;
		int low = 0;
		int mid;

		while((low != high) || !(list.get(low).equals(list.get(high)))){
			mid = low + ((high - low) / (list.get(high) - list.get(low))) * (target - list.get(low));
			if(list.get(mid) == target){
				return mid;
			}else{
				if(list.get(mid) < target){
					low = mid+1;
				}else{
					high = mid-1;
				}
			}
		}
		return -1;
	}
}
