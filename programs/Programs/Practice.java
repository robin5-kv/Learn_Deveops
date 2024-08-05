package newproject;

 interface A 
 {
	 void m1();
	 static void m2() {
		// TODO Auto-generated method stub
		
	}
	 void m3();
	 void m4();
	 
 }
 interface B extends A
 
 {
	 void m5();
	 void m6();
	 void m7();
	 void m8();
	 
 }

 
public class Practice implements A,B 
{

	public static void main(String[] args) {
		
		
		int a[] = {10,12,13,1};
	System.out.println(a[2]);
	
		String name [] = new String[5];
		name[0] = "robin";
		name[1] = "vibin";
		name[2] = "pappa";
		name[3] = "merly";
		name[4] = "minnu";
		
		for(int i= 0;i<name.length;i++)
		{
			System.out.println(name[i]);
		}
		
		B fire  = new Practice();
		fire.m1();

	}

	@Override
	public void m5() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m6() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m7() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m8() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m1() {
		System.out.println("Robin is a good boy");
		
	}

	@Override
	public void m2() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m3() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void m4() {
		// TODO Auto-generated method stub
		
	}

}
