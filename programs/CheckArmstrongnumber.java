package test1;

public class CheckArmstrongnumber {

	public static void main(String[] args) {
		int num = 153;
		int temp = 0;
		int remainder;
		double result = 0;
		temp =num;
		while(temp>0)
		{
			remainder =temp%10;
			result =result+ Math.pow(remainder, 3);
			temp=temp/10;
		}

		if(num==result)
		{
			System.out.println("a");
		}
		else
		{
			System.out.println("B");
		}
	}

}
