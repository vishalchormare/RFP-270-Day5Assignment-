package day5Basic;

import java.util.Scanner;

public class SwapTwoNumber {

	public static void main(String[] args) {
		int x, y, z;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your X Value :");

		x = sc.nextInt();

		System.out.println("Enter Your Y Value :");

		y = sc.nextInt();

		// swap logic

		z = x;
		x = y;
		y = z;

		System.out.println("X Value is " + x + " " + y);

	}

}
