package newproject;

public class Comparetwo {
	
	public static void main(String[] args) {
		boolean arraysareequal = false;
		int a[] = {1,2,4,3};
		int b[] = {1,2,2,3};
		if(a.length ==b.length)
		{
			for(int i =0;i< a.length ;i++)
			{
				if(a[i]!=b[i])
				{
				arraysareequal = true;
				}
			}
		}
		
		else 
		{
			arraysareequal = true;
			
		}
		if(arraysareequal == false)
		{
			System.out.println("Arrays are  equal");
		}
		else {
			System.out.println("Arrays are not equal");
		}
	}
	
	
	
}
