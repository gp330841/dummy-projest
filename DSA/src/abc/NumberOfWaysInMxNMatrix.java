package abc;

public class NumberOfWaysInMxNMatrix {

	public static void main(String[] args) {
		
		int m = 3;
		int n = 3;
		//First method
		int ans1 = calUsingRecursion(m,n);
		System.out.println(ans1);
		
		//second method
		int ans2 = calUsingDP1(m,n);
		System.out.println(ans2);
	}

	private static int calUsingDP1(int m, int n) {
		int dp[][] = new int[m][n];
		
		for(int i=0;i<m;i++)
			dp[i][0]=1;
		
		for(int j=0;j<n;j++)
			dp[0][j]=1
			;
		
		for(int i=1;i<m;i++) {
			for(int j=1;j<n;j++) {
				dp[i][j] = dp[i-1][j]+dp[i][j-1];
			}
		}
		return dp[m-1][n-1];
	}

	private static int calUsingRecursion(int m,int n) {
		if(m==1 || n==1)
			return 1;
		return calUsingRecursion(m-1, n) + calUsingRecursion(m, n-1);
	}

}
