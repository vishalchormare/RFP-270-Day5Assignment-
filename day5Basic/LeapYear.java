package day5Basic;

import java.util.Scanner;

public class LeapYear {

//	a. I/P -> Year, ensure it is a 4 digit number.
//	b. Logic -> Determine if it is a Leap Year.
//	c. O/P -> Print the year is a Leap Year or not.

	public static void main(String[] args) {
		leapyear_fourdigit_number();
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
