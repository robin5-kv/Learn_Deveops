package newproject;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class NumberofString {

	public static void main(String[] args) {
		String name ="Robin is a god boy";
		char[] b = name.toCharArray();
		System.out.println(b);
		
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		for(char a : b) 
		{
			if(hm.containsKey(a))
			{
				hm.put(a, hm.get(a)+1);
				
			}
			else
			{
				hm.put(a, 1);
			}
		}
		/*
		 * 
		 */
		System.out.println(name +"::"+hm );
		
		Set<Entry<Character, Integer>>	entyr= hm.entrySet();
		for (Entry<Character, Integer> s : entyr)
		{
			if(s.getValue()>1)
			{
				System.out.println(s.getKey() +":::::"+ s.getValue());
			}
		}

	}

}
