package newproject;

public class Replacestring {

	public static void main(String[] args) 
	{
		String name ="Robin is attending the interview";
		String	replaceString= name.replace("Robin", "Mech");
		String finalstring =replaceString.replace("attending","conducting");
		System.out.println(finalstring);
	}

}
