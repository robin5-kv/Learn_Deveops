package test1;

import java.util.Arrays;

public class Anagram2 {

	public static void main(String[] args) 
	{
		String name = "God";
		String name1 ="dog";
	char[]	namearray = name.toCharArray();
	char[]	namearray1 = name1.toCharArray();
		
	
	if(name.length()!= name1.length())
	{
		System.out.println("Not anagram");
	}
	
	else 
	{
		Arrays.sort(namearray1);
		Arrays.sort(namearray);
		
	}
	if(Arrays.equals(namearray, namearray1))
	{
		System.out.println("anagram");
	}
	else 
	{
		System.out.println("not anagram ");
	}
	
	}

}
