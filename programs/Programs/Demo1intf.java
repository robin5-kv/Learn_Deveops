package newproject;

interface A1{
	void m1();
	
	void m2();
}

interface A2 extends A1{
	void m3();
	
	void m4();

}
 
public class Demo1intf implements A1,A2
{

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
	System.out.println("robin");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}
	
	public static void main(String[] args)
	{
	
		A1 a =new Demo1intf();
		a.m1();
	}
	
}