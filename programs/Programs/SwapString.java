package newproject;

public class SwapString {

	public static void main(String[] args) {
		String firstname ="Robin";
		String secondname ="vibin";
		
		firstname = firstname+secondname;
		secondname = firstname.substring(0,(firstname.length()-secondname.length()));
		firstname = firstname.substring(secondname.length());
		System.out.println(firstname +"::::::"+secondname);

	}

}
