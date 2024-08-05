package newproject;

public class BigArray {

	public static void main(String[] args) {
		int a [] = {12,34,45,12,12,0};
		int max = a[0];
		for (int i =0;i<a.length;i++)
		{
			if(a[i]<max)
			{
				max =a[i];			
			}	
		
	}
		System.out.println(max);

}
}
