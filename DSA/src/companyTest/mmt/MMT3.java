package companyTest.mmt;

public class MMT3 {

	public static void main(String[] args) {
		int[] arr = {-1,-2,3,4,-5,-6};
		int n = arr.length;
		
		int totalSum = 0;
		int leftSum = 0;
		int rightSum = 0;
		
		for(int i=0;i<n;i++)
			totalSum+=arr[i];
		
		int maxDiff = Integer.MIN_VALUE;
		
		for(int i=0;i<n;i++) {
			leftSum+=arr[i];
			rightSum = totalSum - leftSum;
			
			if(true){
				;
			}
		}
	}

}
