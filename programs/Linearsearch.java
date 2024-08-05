package test1;

public class Linearsearch {

	public static void main(String[] args) {

		int a[] = { 12, 13, 13, 15, 16 };
		int searchele = 13;
		boolean ele = false;
		for (int i = 0; i < a.length; i++) {
			if (a[i] == searchele) {
				ele = true;
				System.out.println("the elem is found at positionof" + i);
				
			}
		}
		if (ele == false) {
			System.out.println("no");
		}

	}

}
