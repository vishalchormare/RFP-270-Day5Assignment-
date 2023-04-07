package day5Basic;

import java.util.Scanner;

public class Vowel_and_Constant {
	public static void main(String[] args) {

		Scanner sc = new Scanner (System.in);
		
		System.out.println("Enter the Aphabet for checking Vowel or Constatn");
		char ch=sc.next().charAt(0);
		
		if(ch=='a'||ch=='o'||ch=='u'||ch=='e'||ch=='i'||ch=='A'||ch=='O'||ch=='U'||ch=='I'||ch=='E') {
			System.out.println(ch+" "+"is Vowel ");
		}else {
			System.out.println(ch+" "+"is Constant ");
		}
	}
}
