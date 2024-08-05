package newproject;

public class DuplicateArray {

	public static void main(String[] args) {
		int a []= {13,2,3,32,34,12};
		boolean element = false;
		for (int i =0;i<a.length;i++)
		{
			for (int j= i+1; j<a.length;j++)
			{
				if(a[i]==a[j])
				{
					element = true;
					System.out.println("the posotion of the element "+i +" and "+j);
					
					break;
					
				}
			}
		}
		if(element == true)
			
		{
			System.out.println("Element found");
		}
		else {
			System.out.println("Element  notfound");
		}

	}

}
