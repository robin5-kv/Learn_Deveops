package newproject;

abstract class number
{
	abstract void m1();
	abstract void m2();
	void m3() {
		System.out.println("robin");
	}
}

class number2 extends number{

	@Override
	void m1() {
		// TODO Auto-generated method stub
		
	}

	@Override
	void m2() {
		System.out.println("fire");
		
	}
	
}


public class Absclass
{

	public static void main(String[] args) {
	
		number abc = new number2();
		abc.m2();
		abc.m3();
	}
	
}
