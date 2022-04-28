package companyTest.skellem;

public class Test1 {

	public static void main(String[] args) {
		String str = "abcbcd";
		String pat = "cab";
		
		boolean ans = ifContains(str,pat);
		System.out.println(ans?"Contains":"Not contains");
	}

	private static boolean ifContains(String str, String pat) {
		boolean ans = false;
		int count = 0 ;
		
		for(int i=0;i<=(str.length()-pat.length());i++) {
			count=0;
			for(int j=0;j<pat.length();j++) {
				if(str.charAt(i+j)==pat.charAt(j)) {
					count++;
				}
			}
			//if pattern matches all characters in the given string
			if(count==pat.length()) {
				ans = true;
				break;
			}
		}
		return ans;
	}

}
