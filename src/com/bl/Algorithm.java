package com.bl;

public class Algorithm {
	public int[] insertionSort(int[] array) {
		for (int i = 0; i < array.length; i++) {
			int num1 = array[i];
			int temp = i - 1;
			while (temp >= 0 && array[temp] > num1) {
				array[temp + 1] = array[temp];
				temp = temp - 1;
			}
			array[temp + 1] = num1;
		}
		return array;
	}

	public void displaySort(int[] array) {
		for (int num2 : array) {
			System.out.print(" " + num2);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Algorithm sort = new Algorithm();

		int array[] = { 40, 30, 10, 70, 50, 20, 60 };
		int[] sortedArray = sort.insertionSort(array);
		sort.displaySort(sortedArray);
	}
}