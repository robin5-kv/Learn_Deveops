package test1;

public class Wed {
	// Java program to check whether second string
	// can be formed from first string

	

		static int MAX = 256;

		static boolean canMakeStr2(String str1, String str2)
		{
			// Create a count array and count frequencies
			// characters in str1.
			int[] count = new int[MAX];
			char []str3 = str1.toCharArray();
			for (int i = 0; i < str3.length; i++)
			{
				count[str3[i]]++;
			}
			// Now traverse through str2 to check
			// if every character has enough counts
			
			char []str4 = str2.toCharArray();
			for (int j = 0; j < str4.length; j++) 
			{
				if (count[str4[j]] == 0)
				
					return false;
					count[str4[j]]--;
				
					
			}
			return true;
		}

		// Driver Code
		/*
		 * static public void main(String []args) { String str1 = "geekforgeeks"; String
		 * str2 = "for"; if (canMakeStr2(str1, str2)) System.out.println("Yes"); else
		 * System.out.println("No"); }
		 */

	public static void main(String[] args) {
		String str1 = "Robin is a good boy";
		String str2 = "good";
		if (canMakeStr2(str1, str2))
			System.out.println("Yes");
		else
			System.out.println("No");

	}

}
