package day5Basic;

import java.util.Scanner;

public class PrimeFactor {

	public static void main(String[] args) {
		primeFactor();
	}

	static void primeFactor() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number for Prime Factor");
		int num = sc.nextInt();

		for (int i = 2; i <= num; i++) {
			
//			System.out.println("INumber"+i);
//			System.out.println("Num"+num);

			while(num % i == 0) {

				num = num / i;
				
				System.out.println(i + "");
			}

		}
	}
}
