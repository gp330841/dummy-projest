package test;

import java.util.Arrays;
import java.util.Scanner;

public class MyClass {
	
	public static void main(String[] args) {
		Scanner sc  = new Scanner(System.in);
		int n = sc.nextInt();
		int[] arr = new int[n];
		for(int i=0;i<n;i++)
			arr[i]=sc.nextInt();
		
		int value = sc.nextInt();
		double s = System.currentTimeMillis();
		long ans = getAnsDP(value, arr);
//		long ans2  = coinExchange(value,arr,0);
		System.out.println(ans);
		System.out.println(System.currentTimeMillis()-s);
		MyClass obj = new MyClass();
//		obj.equals(obj)
		
	}
	
	static int coinExchange(int n,int coins[],int index) {
		int ans=0;
		if(n<0)
			return 0;
		if(n==0)
			return 1;

		for(int i=index;i<coins.length;i++) {
			ans += coinExchange(n-coins[i], coins, i);
		}
		return ans;
	}
	
	private static long getAnsDP(int n, int[] arr) {
		long[] ans = new long[n+1];
		Arrays.fill(ans, 0);
		ans[0]=1;
		for (int i=0; i<arr.length; i++)
            for (int j=arr[i]; j<=n; j++)
            	
                ans[j] += ans[j-arr[i]];
		
		return ans[n];
	}
}
