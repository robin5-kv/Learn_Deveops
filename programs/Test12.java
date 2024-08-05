package test1;

public class Test12 {

	public static void main(String[] args) {
		int a[] = { 2, 7, 11 };
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if ((a[i] + a[j] == 9)) {
					int b[] = new int[2];
					b[0] = j;
					b[1] = j + 1;
					System.out.println(b[0] + b[1]);
					break;
				}
			}
		}
	}
}
