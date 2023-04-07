package day5Basic;

import java.util.Scanner;

public class Quotient_and_Remainder {

	public static void main(String[] args) {
		quotinetRemainder();
	}

	static void quotinetRemainder() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter the number   Divined :");
		int div = sc.nextInt();

		System.out.println("Please Enter the number   Diviosr :");
		int divs = sc.nextInt();

		float remainder, quotinet;
		remainder = (int) div % divs;
		System.out.println(remainder);
		quotinet = (int) div / divs;
		System.out.println(quotinet);

	}
}
