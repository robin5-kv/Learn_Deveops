package test1;

public class Biggestarray {

	public static void main(String[] args) {

		int[] a = { -1, 12, 45, 23};
		int max = a[0];
		for (int i = 0; i < a.length; i++)
		{
			if (a[i] > max) 
			{
				max = a[i];
			}
		}
		System.out.println(max);
	}

	
}
