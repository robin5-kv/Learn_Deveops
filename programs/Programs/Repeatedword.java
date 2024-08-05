package newproject;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Repeatedword {

	public static void main(String[] args) {
		String name = "Robin is a good robin is a good";
		
		HashMap<String,Integer> hm = new HashMap<String,Integer>();
		String[] namearray = name.split(" ");
		
		for(String word: namearray)
		{
			if(hm.containsKey(word))
			{
				hm.put(word, hm.get(word)+1);
			}
			else 
			{
				hm.put(word, 1);
			}
				
		}
	Set<Entry<String, Integer>>	 wordentry =hm.entrySet();
//	for(Entry<String, Integer>value:wordentry)
//	{
//		
//			if(value.getValue()>1)
//			{
//			System.out.println(value.getKey() +"::::"+value.getValue());
//			}
//	}
//		
	Iterator<Entry<String, Integer>> itr=	wordentry.iterator();
	
		while(itr.hasNext())
		{
			Map.Entry entry1= (Entry)itr.next();
			System.out.println(entry1.getKey() +"::::"+ entry1.getValue());
		}
	}

}
