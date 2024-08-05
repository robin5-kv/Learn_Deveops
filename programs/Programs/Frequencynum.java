package newproject;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Frequencynum {

	public static void main(String[] args) {
		Long number = 798275822979L;
		HashMap<Long, Integer>  hm = new HashMap<Long, Integer>();
		
		while(number >0)
		{
			Long numdigit =number%10;
			if(hm.containsKey(numdigit))
			{
				hm.put(numdigit, hm.get(numdigit)+1);
				
			}
			else
			{
				hm.put(numdigit, 1);
			}
			number = number/10;
		}
		
		//Set<Entry<Long, Integer>>		entry=	;
		Set<Long>	s=hm.keySet();
		for(Long value :s)
		{
		System.out.println(value +"::::"+hm.get(value));
		}

	}

}
