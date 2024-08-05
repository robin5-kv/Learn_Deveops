package newproject;

public class Vovel {

	public static void main(String[] args) {
		String  name = "robin is a good boy";
		
		char [] namearray =name.toCharArray();
		int vowels =0;
		int space= 0;
		int consonants =0;
		
		for(int i =0 ;i<namearray.length;i++)
		{
			if((name.charAt(i)== 'a') ||(name.charAt(i)== 'e')|| (name.charAt(i)== 'i')||
					(name.charAt(i)== 'o')||(name.charAt(i)== 'u'))
			{
				vowels++;
			}
			else if (name.charAt(i)== ' ')
			{
				space++;
			}
			else {
				consonants++;
			}
					
		}
		System.out.println(vowels +":"+ consonants +"::"+ space);
	}

}
