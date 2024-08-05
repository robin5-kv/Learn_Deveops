package newproject;

public class RevString {

	public static void main(String[] args) {
		
		String a = "Robin";
		char b [] = a.toCharArray();
		String	revString ="";
for(int i = a.length()-1 ;i>=0;i--)
		{
			revString = revString+b[i];
		}
System.out.println(revString);
	}

}
