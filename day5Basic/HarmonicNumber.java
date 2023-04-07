package day5Basic;

import java.util.Scanner;

public class HarmonicNumber {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter The Number for Harmonic number : ");
		int num = sc.nextInt();
		HarmonicNumber objHarmonic = new HarmonicNumber();
		objHarmonic.harmonicNumber(num);

	}

	int harmonicNumber(int inPuteNumber) {

		double result = 0.0;

		if (inPuteNumber != 0) {

			result = result + (double) 1 / (inPuteNumber);

			System.out.println(result + "************");

		} else {
			System.out.println("Please Enter the valid number ");
		}
		return inPuteNumber;

	}
}
