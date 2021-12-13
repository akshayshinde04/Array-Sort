package com.bl;

import java.lang.*;
import java.util.Arrays;
import java.util.Scanner;

public class Algorithm {
	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);
		System.out.println("Enter the first string");
		String word1 = scan.next();
		System.out.println("Enter the second string");
		String word2 = scan.next();

		char[] charArray1 = word1.toCharArray();
		char[] charArray2 = word2.toCharArray();

		Arrays.sort(charArray1);
		Arrays.sort(charArray2);

		boolean result = Arrays.equals(charArray1, charArray2);

		if (result == true) {
			System.out.println("Strings are Anagram");
		} else {
			System.out.println("Strings are NOT Anagram");
		}
	}
}