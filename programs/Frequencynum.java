package test1;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.Set;

public class Frequencynum {

	public static void main(String[] args) {
		long a = 1878912784972L;
		HashMap<Long, Integer> hm = new HashMap<>();
		while (a != 0) {
			long lastdigit = a % 10;
			if (hm.containsKey(lastdigit)) {
				hm.put(lastdigit, hm.get(lastdigit) + 1);
			} else {
				hm.put(lastdigit, 1);
			}
			a = a / 10;
		}
		//Set<Entry<Long, Integer>> rr= hm.entrySet();
		for (Entry<Long, Integer> entry : hm.entrySet()) {
			Long key = entry.getKey();
			Integer val = entry.getValue();
			System.out.println(key + ":" + val);
		}

		Set<Long> value = hm.keySet();
		for (Long op : value) {
			System.out.println(op + "::" + hm.get(op));
			
		}

	}

}
