package newproject;

public class Stringsame {

	
	
	
	static int count =256;
	static int max[] =new int[count];
	static boolean isstringsame(String str1,String str2)
	{
		
		char[] str3 = str1.toCharArray();
		char[] str4 =str2.toCharArray();
		
		for(int i=0;i<str1.length()-1;i++)
		{
			max[str3[i]]++;
		}
		
		for(int j=0;j<str2.length()-1;j++)
		{
			if(max[str4[j]]==0)
			{
				return false;
			}
			max[str4[j]]--;
		}	
		
		
		return true;
		
	}
	public static void main(String[] args) 
	{
		System.out.println(isstringsame("robin","robin"));
		
		

	}

}
