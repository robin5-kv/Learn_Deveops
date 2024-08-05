package newproject;

import java.util.Arrays;

public class Removearray {

	public static void main(String[] args) {
		int firstarray[] = {1,2,3,4,5,56};
		int secondarray[] =new int[firstarray.length-1];
		int index=3;
				int k =0;
				
				for(int i=0;i<firstarray.length;i++)
				{
					if(firstarray[i]==index)
					{
						continue;
					}
					secondarray[k++]= firstarray[i];
				}
				System.out.println(Arrays.toString(secondarray));

	}

}
