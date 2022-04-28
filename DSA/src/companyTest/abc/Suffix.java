package companyTest.abc;

import java.util.Scanner;

public class Suffix {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n;
		n = sc.nextInt();
		int[] arr = new int[n];
		int i;
		for (i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		suf(arr, n);
		for (int j = 0; j < n; j++)
			System.out.print(arr[j] + " ");

	}

	static void suf(int[] arr, int n) {
		int i, sum;
		sum = 0;
		for (i = 0; i < n; i++) {
			sum += arr[i];

		}

		for (i = 0; i < n; i++) {
			arr[i] = sum - arr[i];
			sum = arr[i];
		}

	}

}
