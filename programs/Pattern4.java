package test1;

public class Pattern4 {

	
	 static void num(int n)
	 {
		 for (int i=1;i<=n;i++)
		 {
			 for(int spaces=n;spaces>=i;spaces--)
			 {
				 System.out.print(" ");
		 
			 }
		 for (int k=n;k>=i;k--)
		 {
			 
			 System.out.print(" *");
		 }
		 System.out.println("");
			 }
		 
	 }
	 
	public static void main(String[] args) {
	
		num(10);

	}

}
