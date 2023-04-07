package day5Basic;

import java.util.Scanner;

public class FlipCoin {

	public static void main(String[] args) {

		FlipCoin filCoin = new FlipCoin();
		filCoin.printofHead_and_Tails();


	}

	void printofHead_and_Tails() {

		int n, h_count = 0, t_count = 0;
		double head, tail, random;

		Scanner enternumber = new Scanner(System.in);

		System.out.print("enter no. of times you want to flip the coin: ");

		n = enternumber.nextInt();

		for (int i = 0; i < n; i++) {
			random = Math.random();
			if (random < 0.5) {
				t_count++;
			} else {
				h_count++;
			}

		}
		head = h_count / (double) n * 100;
		tail = t_count / (double) n * 100;
		System.out.println("Percentage of heads: " + head + "%");
		System.out.println("Percentage of tails: " + tail + "%");

		System.out.println("***********************************");
	}

	static void leapyear_fourdigit_number() {

		int year, n;

		String str;
		Scanner enteryear = new Scanner(System.in);

		System.out.println("enter year  4 digit number");

		str = enteryear.nextLine();

		year = Integer.parseInt(str);

		n = str.length();

		if (n != 4) {

			System.out.println("enter year as 4 digit number");

		} else {
			if (n % 400 == 0 && n % 100 == 0) {
				System.out.println("year " + year + " is a leap year");
			} else if (n % 100 != 0 && n % 4 == 0) {
				System.out.println("year " + year + " is a leap year");
			} else {
				System.out.println("year " + year + " is not a leap year");
			}
		}
	}

}
