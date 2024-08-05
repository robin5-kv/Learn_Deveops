package newproject;

import java.util.regex.Pattern;

public class Wordreverse {

	public static void main(String[] args) {
		
		String name = "robin is a good boy";
		Pattern pattern = Pattern.compile("\\s");
		String[] namearray=	pattern.split(name);
		String rev =" ";
	
		for(int i =0;i<namearray.length;i++)
		{
		if(i==namearray.length -1)
		{
			rev = namearray[i]+rev;
		}
		else {
			rev= " "+namearray[i]+rev;
		}
	}
	System.out.println(rev);

	}

}
