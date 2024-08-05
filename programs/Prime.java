package test1;

public class Prime {

	// 1,2

	public static boolean checknumber(int num) {
		if (num <= 0) {
			return false;

		}
		for (int i = 2; i < num; i++) {
			if (num % i == 0) {
				return false;
			}
		}

		return true;
	}

	public static void seriesofprimenumber(int number) {
		for (int i = 2; i <= number; i++) {
			if (checknumber(i))
				System.out.println(+i);

		}
	}

	public static void main(String[] args) {
	
		Prime.seriesofprimenumber(23);

	}

}
