package test1;

public class Comparetwoarrays {

	public static void main(String[] args) {

		int a[] = { 19, 12, 11, 13 };
		int b[] = { 19, 12, 11, 13 };
		boolean equallength = false;
		if (a.length == b.length) 
		{
			for (int i = 0; i < a.length; i++)
			{
				if (a[i] != b[i]) 
				{                                 
					equallength = true;
				}
			}
		} 
		else 
		{
			equallength = true;
		}
		if (equallength == false) {
			System.out.println("Arrays are equal");
		} else {
			System.out.println("not equal");
		}
	}

}
