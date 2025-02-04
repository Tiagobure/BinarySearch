package binarySearch;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		int[] vector = new int[1000000];

		for (int i = 0; i < vector.length; i++) {
			vector[i] = i * 2;
			//System.out.println(vector[i]);

		}
		System.out.println("What number are you looking for?");
		Scanner sc = new Scanner(System.in);
		int search = sc.nextInt();

		int counter = 0;

		boolean find = false;
		int start = 0;
		int end = vector.length - 1;
		int half;

		while (start <= end) {
			half = (int) ((start + end) / 2);
			counter++; // counts how many tests were done in the search
			if (vector[half] == search) {
				find = true;
				break;
			} else if (vector[half] < search) {
				start = half + 1;
			} else {
				end = half - 1;
			}

		}
		System.out.println("number of tests: " + counter);
		
		if (find == true) {
			System.out.println("find ;)");
		} else {
			System.out.print("did not find :(");
		}

		sc.close();

	}

}
