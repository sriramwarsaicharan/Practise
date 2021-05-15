package red;

public class Polindrome {

	public static boolean polindrome(int number) {
		int n=number;
		int reverse=0;
		while(n!=0) {
			int reminder=n%10;
			reverse=(reverse*10)+reminder;
		}
		if(number==reverse) {
			return true;
		}
		return false;
		
	}
}
