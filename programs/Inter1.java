package test1;

interface A
{
	void m1();
	void m2();
}
interface b{
	void m3();
	void m4();
}




public class Inter1 implements A,b 
{

	@Override
	public void m3() {
		System.out.println("a");
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		System.out.println("a");
	}

	@Override
	public void m1() {
		// TODO Auto-generated method stub
		System.out.println("a");
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		System.out.println("a");
	}

	public static void main(String[] args)
	{
		Inter1 e =new Inter1();
		e.m1();
		e.m2();
		e.m3();
		e.m4();
		A ee=new Inter1();
		ee.m1();
	}

	

}
