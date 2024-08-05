package newproject;

public class Primenumber 
{
public static boolean checkprime (int n)
{
	if(n<=0) 
	{
		return false;
	}
	for(int i =2;i<=n;i++)
	{
		if(n%2 ==0)
		{
			return false; 
		}
	}
	
	return true;
	
	
}

public static void seriesofprime(int n)
{

	for(int i=2; i<=n;i++)
	{
		if(checkprime(i))
		{
			System.out.println(+i);
		}
	}
	
}

public static void main(String[] args) {
	seriesofprime(23);
	 }
}
