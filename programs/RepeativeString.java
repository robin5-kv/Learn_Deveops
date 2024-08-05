package test1;

import java.util.HashMap;

public class RepeativeString {

	public static void main(String[] args) {
		String a = "kfjlflkslm,jkdkjksjks";
		HashMap<Character, Integer> hm = new HashMap<Character, Integer>();
		char[] ab = a.toCharArray();
		for(char namechar:ab)
		{
			if (hm.containsKey(namechar)) {
				hm.put(namechar, hm.get(namechar) + 1);
			} else {
				hm.put(namechar, 1);
		}
		
		
		

	}

}
