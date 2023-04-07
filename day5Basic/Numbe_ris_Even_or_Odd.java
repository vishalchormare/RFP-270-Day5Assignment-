package day5Basic;

import java.util.Scanner;

public class Numbe_ris_Even_or_Odd {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Please Enter the number for checkin even or odd");
		int num = sc.nextInt();
		if (num % 2 == 0) {
			System.out.println(num + " " + "Number is Even");
		} else {
			System.out.println(num + " " + "Number is Odd");
		}
	}

}
