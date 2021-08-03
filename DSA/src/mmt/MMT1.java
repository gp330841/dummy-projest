package mmt;

import java.util.Arrays;

public class MMT1 {

	public static void main(String[] args) {
		int n  = 5;
		long numberOfWays = getWays(n);
//		System.out.println("Number of ways:"+numberOfWays);
		
		System.out.println("Number of ways:"+getWaysUsingDP(n));
	}

	private static long getWaysUsingDP(int n) {
		int[] dp = new int[n+1];
		
		//0 for all elements
		Arrays.fill(dp, 0);
		dp[0]=1;
		dp[1]=1;
		
		for(int i=2;i<=n;i++) {
			dp[i]=dp[i-1]+dp[i-2];
		}
		return dp[n];
	}

	private static long getWays(int n) {
		if(n<=1)
			return 1;
		return getWays(n-1)+getWays(n-2);
	}

}
