package com.bridgelabs;
import java.util.*;
public class PrimeNumber {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int ans = 0;
		for (int i = 2; i<=n/2;i++) {
			ans = n%i;
		}
		if (ans == 0) {
			System.out.println(n+" is not Prime no");
		}
		else {
			System.out.println(n+" is Prime no");
		}
	}

}
