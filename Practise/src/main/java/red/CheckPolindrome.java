package red;

import java.util.Scanner;

public class CheckPolindrome {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("enter a number to checking if it is a polindrome ");
		int polindrome=s.nextInt();
		System.out
		.println("this number"+polindrome
				+"is a polindrome or not?"
				+red.Polindrome.polindrome(polindrome));
		s.close();
	}
}
