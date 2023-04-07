package day5Basic;

import java.util.Scanner;

public class Largest_Number {
	public static void main(String[] args) {

		int x, y, z;

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter The First Value :");
		x = sc.nextInt();

		System.out.println("Enter The Second Value :");
		y = sc.nextInt();

		System.out.println("Enter The Third Value :");
		z = sc.nextInt();

		if (x >= y && x >= z) {
			System.out.println("Your First Value Great than Second and Third Vale" + " " + x);
		} else if (y >= x && y >= z) {
			System.out.println("Your Second Value Great than First and Third Vale" + " " + y);
		} else {
			System.out.println("Your Third Value Great than First and Second Vale" + " " + z);
		}
	}

}
