package test1;

public class Sumarray {

	public static void main(String[] args) {
		int [] a = {10,12,12,14};
		int sum =0;
		
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
		}
		System.out.println(sum);
	}

}
