package test1;

import java.util.regex.Pattern;

public class Wordreverse {

	public static void main(String[] args) {
		String name = "Robin is  good boy";
		Pattern pattern1 = Pattern.compile("\\s");
		String[] namearray= pattern1.split(name);
		String Reverse = "";
		
			for(int i =0;i<namearray.length;i++)
			{
			
				  if(i==namearray.length -1)
			{
				Reverse = namearray[i]+Reverse; 
			}
			   else 
			{
				Reverse = " "+namearray[i]+Reverse; 
			}	
			}
		
		
		System.out.println(Reverse);

	}

}
