package main.java.Random_Good_Problems;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayLeftRotation_18 {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		int temp = 0;

		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter no. of left rotations that you want :");
		int rotations = scanner.nextInt();
		scanner.close();
		System.out.println("Array before Rotation :");
		Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
		System.out.println();
		for (int k = 1; k <= rotations; k++) {
			temp = arr[0];
			for (int i = 1; i < arr.length; i++) {
				arr[i - 1] = arr[i];
			}
			arr[arr.length - 1] = temp;
		}
		System.out.println("Array after rotation :");
		Arrays.stream(arr).boxed().map(x -> x + " ").forEach(System.out::print);
	}
}