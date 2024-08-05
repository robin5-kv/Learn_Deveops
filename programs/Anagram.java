package test1;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		String s1 = "dog";
		String s2 = "god";
		int len1 = s1.length();
		int len2 = s2.length();
	char[] regular=	s1.toCharArray();
	char[] regular1=s2.toCharArray();
		
		if (len1 != len2)
		{
			System.out.println("It is not anagram");
		} 
		
		else 
		{
			
			Arrays.sort(regular1);
			Arrays.sort(regular);
		}
		if(Arrays.equals(regular, regular1))
		{
			System.out.println("anafram");
		}
		else
		{
			System.out.println("NA");
		}
	}

}
