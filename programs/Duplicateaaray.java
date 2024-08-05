package test1;

public class Duplicateaaray {

	public static void main(String[] args) {

		int a[] = { 12, 11, 14, 123, 19, 121 };
		int count = 0;
		boolean duplicate = false;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] == a[j]) {//12!13,12!14,12!12
					duplicate = true;
					
					//System.out.println("the given element it is in the position" + i);
					//count++;
				}
			}
		}
		if (duplicate == false)
		{
			System.out.println("no dupliccate");

		} 
		else
		{
			System.out.println( "dupliccate");
		}
		
	}

}
