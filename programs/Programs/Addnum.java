package newproject;

public class Addnum {

	public static void main(String[] args) {
		int num = 234;
		int add = 0;
		while(num>0)
		{
			add =add+num%10;
			num =num/10;	
		}
		System.out.println(add);

	

		String s ="null";
		if(s==null)
		{
			System.out.println("true");
		}
		System.out.println("false");
		
		
	}
}
