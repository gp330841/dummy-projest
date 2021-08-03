package mmt;

import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;

public class LRU {

	public static void main(String[] args) {
		Queue<Integer> list = new PriorityQueue<>();
		int[] arr = {1,2,3,4,5,6,1,3,2};
		
		/*
		 * key: node
		 * value: index
		 */
		Map<Integer, Integer> map = new HashMap<>();
		
		for(int i=0;i<arr.length;i++) {
			if(list.size()<=5) {
				//add at starting
				list.add(arr[i]);
				map.put(arr[i],0);
			}
			else
			{
				if(map.containsKey(arr[i])) {
					if(map.get(arr[i])!=0)
					{
						
					}
					
				} else {
					
				}
				
//				for(int elem : list) {
//					if(elem==arr[i]) {
//						//remove the lement
//						list.remove(elem);
//						//add at start
//						list.add(elem);
//					} 
//					else 
//					{
//						//remove from end
//						list.poll();
//						//add at start
//						list.add(arr[i]);
//					}
//				}
			}
		}

	}

}
