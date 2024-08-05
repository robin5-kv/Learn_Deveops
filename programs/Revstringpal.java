package test1;

public class Revstringpal {

	public static void main(String[] args) {

		String s = "MADAM";
		String temp = s;
		char[] b = s.toCharArray();
		String rev = "";

		for (int c = s.length()-1; c >= 0; c--) {
			rev = rev+b[c];
		}

		System.out.println(rev);
		
		if (rev.equals(s) )
		{
			System.out.println("p");
		} 
		else 
		{
			System.out.println("np");
		}
	}

}
