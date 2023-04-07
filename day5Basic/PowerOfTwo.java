package day5Basic;

import java.util.Scanner;

public class PowerOfTwo {

	public static void main(String[] args) {

		powerOfTwo();
	}

	static void powerOfTwo() {

		Scanner sc = new Scanner(System.in);

		int num;
		System.out.println("Please Enter the number ");
		num = sc.nextInt();
		int base = 2;
		int result = 1;

		if (0 <= num && num < 31) {
			for (int i = 0; i <= num; i++) {
				result = result * base;
			}
			System.out.println(num + "The Powr of number" + result);
		} else {

			System.out.println("Please enter the under range 31");
		}
	}
}
