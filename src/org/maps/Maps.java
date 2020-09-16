package org.maps;

import java.util.Hashtable;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;


public class Maps {
	public static void main(String[] args) {
		Map<Integer, String> mp = new Hashtable<Integer, String>();
		mp.put(10, "java");
		mp.put(11, "C++");
		mp.put(17, "Python");
		mp.put(13, "Sql");
		mp.put(100, "DotNet");
		mp.put(5, "ghhjg");
		System.out.println(mp);
		System.out.println("Only keys in Map");
		Set<Entry<Integer, String>> s = mp.entrySet();
		for (Entry<Integer, String> entry : s) {
			System.out.println(entry);
			System.out.println(entry.getValue());
			System.out.println(entry.getKey());

		}

	}
}
