package companyTest.mmt;

public class MMT2 {

	public static void main(String[] args) {
		long n = 16;
		
		long ans = 1;
		while(ans*ans<n) {
			ans++;
		}
//		System.out.println(ans);
		
		System.out.println("Ans using binary search:"+getAns(n,0,n/2));
	}

	private static long getAns(long n,long low,long high) {
		long mid = (low+high)/2;
		
		if(mid*mid<n)
			return getAns(n, mid+1, high);
		else if(mid*mid>n)
			return getAns(n, low, mid-1);
		else
			return mid;
	}

}
