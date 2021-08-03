package mmt;

import java.util.HashMap;
import java.util.Map;

public class MMT4 {

	public static void main(String[] args) {
		int[] arr = {4,7,9,5,11,3,1,2};
		
		Map<Integer, Integer> map = new HashMap<>();
		int max=Integer.MIN_VALUE,min=Integer.MAX_VALUE;
		for(int i=0;i<arr.length;i++) {
			map.put(arr[i], 1);
			if(max<arr[i])
				max=arr[i];
			if(min>arr[i])
				min=arr[i];
		}
		int ans=0,count=1;
		for(int i=min+1;i<=max;i++) {
			if(map.containsKey(i) && map.containsKey(i-1)) {
				count++;
			} else {
				count=1;
			}
			if(count>ans)
				ans=count;
		}
		System.out.println("ans:"+ans);
		
	}
}
