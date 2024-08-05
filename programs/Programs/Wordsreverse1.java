package newproject;

public class Wordsreverse1 {

	public static void main(String[] args) {
		
		
		String name = "robin is good boy";
		String revstrin = " ";
		String[] namearray = name.split(" ");
	
		for(String words:namearray) 
		{
			String revword =" ";
			
			for(int i= words.length()-1;i>=0;i--)
			{
				revword = revword+words.charAt(i);
	
			}
			revstrin =revstrin+revword+" ";
		}
		
			System.out.println(revstrin);
	}

}
