package abc;

public class XYZ2 {
	
	public static void main (String[] args)
	{
		int[] arr = {1,2,3,4,5,6,7,8};
		int n =arr.length;
		int l=0,r=n-1,k=n-1;
		int tmp1,tmp2;
		int count  = 0;
		while(l<=r) {
			tmp1 = arr[l];
			tmp2 = arr[l+1];
			
			
			//swap
			arr[l] = arr[r];
			arr[r] = tmp1;
			
			
			//swap k
			arr[l+1] = arr[k];
			arr[k]  = tmp2;
			
			l+=2;
			r--;
			k-=count++;
		}
		
		for(int i=0 ; i<n;i++)
			System.out.print(arr[i]+",");
	}
}
