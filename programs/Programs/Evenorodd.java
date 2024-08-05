package newproject;

public class Evenorodd {

	public static void main(String[] args) {
		int even = 0, odd =0;
		int num [] = {1,4,6,3,2,2,10};
		int add= 0;
		int count =0;
		for(int i =0;i<num.length;i++)
		{
			if(num[i]%2 ==0)
			{
				add =add+num[i];
				count++;
			}
		}
		System.out.println(add);
		System.out.println(count);
		
	}

}
