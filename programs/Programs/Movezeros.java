package newproject;

public class Movezeros {

	public static void main(String[] args) {
		int a[] = {2,0,3,4,42,0,2,0,2,0};
		
		int count =0;
		for(int i =0;i<a.length;i++)
		{
			if(a[i]!=0)
			{
				a[count++]=a[i];
			}
		}
		while(count<a.length)
		{
			a[count++]=0;
		}
		for(int j=0;j<a.length;j++)
		{
			System.out.println(a[j]+"" );
		}
	}

}
