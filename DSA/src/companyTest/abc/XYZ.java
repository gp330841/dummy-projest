package companyTest.abc;

import java.util.Scanner;

public class XYZ {
	public static void main(String args[] ) throws Exception {
		Scanner sc = new Scanner(System.in);
		
    	String str = sc.next();
    	int l = sc.nextInt();
    	
    	System.out.println(getAns(str,l));
    }

	private static int getAns(String str, int l) {
		int c = 0;
		int max = Integer.MIN_VALUE;
		for(int i=0;i<=str.length()-l;i+=l) {
			c=0;
			for(int j=i;j<i+l;j++) {
				if(str.charAt(j)=='1')
					c++;
			}
			if(max<c)
				max=c;
		}
		return max;
	}
}
