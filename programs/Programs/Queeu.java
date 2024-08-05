package newproject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;

public class Queeu {

	public static void main(String[] args) {
		Queue<String> que =new PriorityQueue<>();
		que.add("robin");
		//que.add(null);
		que.add("vibin");
		System.out.println(que);
		System.out.println(que.peek());
		System.out.println(que.poll());
		
		List<Object> obj = new ArrayList<Object>(Arrays.asList("a","b"));
		obj.add("robin");
		obj.add(1);
		obj.add(null);
		System.out.println(obj);
//		obj.remove(0);
//		System.out.println(obj);
		obj.set(0, "d");
		System.out.println(obj);
		
		Iterator<Object> itr = obj.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
		}
		ListIterator<Object> listitr = obj.listIterator();
		
		while(listitr.hasPrevious())
		{
			System.out.println(listitr.previous());
	}
		
	
		Set<Object> set = new LinkedHashSet<Object>(Arrays.asList("1"));
		set.add("robin");
		set.add(null);
		boolean t = set.add("robin");
		System.out.println(t);
		System.out.println(set);
		Iterator<Object>itr1 = set.iterator();
		
		while(itr1.hasNext())
		{
			System.out.println(itr1.next());
		}
		
		set.remove("robin");
		System.out.println(set);
		
	Map<Integer, String> hm = new LinkedHashMap<Integer, String>();
	hm.put(1, "robin");
	hm.put(2, "vibin");
	System.out.println(hm);
	// converting entry set
for (Map.Entry<Integer, String> entry : hm.entrySet()) 
{
	Integer key = entry.getKey();
	String val = entry.getValue();
	System.out.println(key+val);
	
}
	
	System.out.println(Collections.singletonMap(1, "tr"));
	
	
	}
	
	

				}


