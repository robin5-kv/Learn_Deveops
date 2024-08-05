package test1;

public class Countevenorodd {

	public static void main(String[] args) {

int num = 1234;
int even =0;
int odd=0;
int val=0;
while(num>0)
{
  val=num%10;
  if(val%2==0)
  {
	  even++;
  }
  else
  {
	  odd++;
  }
  num=num/10;
}
System.out.println(even+ " "+odd);
	}

}
