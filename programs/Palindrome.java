package test1;

public class Palindrome {

	public static void main(String[] args) {

		int num = 123;
		int temp =num;
		int rev = 0;
		while (num > 0) {
			rev = rev * 10 + num % 10;
			num = num / 10;

		}
		if (temp == rev) {
			System.out.println("palindrome");
		} else
		{
			System.out.println("not palindrome");
		}
	}

}
