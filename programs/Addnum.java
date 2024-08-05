package test1;

public class Addnum {

	public static void main(String[] args) {
		int num=123;
		int add=0;
		while(num>0)
		{
			add=add+num%10;
			num=num/10;
		}
	System.out.println(add);
		}

	}


