package abc.com;

import java.util.Arrays;
import java.util.HashMap;

public class Quest1 {

	public static void main(String[] args) {
		String s1="sumit";
		
		String s=new String("sumit");
		
		
		
		
		HashMap<String, Integer> hm=new HashMap<>();
		hm.put(s, 1);
		hm.put(s1, 2);
		
		
		System.out.println(hm);
		/*
		 * String str = "zgwabcdegqwdhiklmnopqadsrtuwevxzgwe";
		 * 
		 * int[] arr = new int[26]; for(int i=0;i<26;i++) arr[i]=0;
		 * 
		 * int max = 0,x=26; for(int i=0 ;i<str.length();i++) { x = str.charAt(i)-'a';
		 * max = 0 ; for(int j=0;j<x;j++) {
		 * 
		 * if(max<arr[j]) max=arr[j]; } arr[x]=max+1; } max=0; for(int i=0;i<26;i++) {
		 * if(max<arr[i]) max=arr[i]; } System.out.println(26-max);
		 */
	}
}
