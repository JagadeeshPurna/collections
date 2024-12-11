package java_collections;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapIterator {

	public static void main(String[] args) {
		Map<Integer,String> map = new LinkedHashMap();
		map.put(1, "Momo Ayase");
		map.put(2, "Ken Takakura");
		map.put(3, "aira Shiratori");
		map.put(4, "Jiji");
		map.put(5, "Granny Saiko");
		System.out.println(map);
		Iterator<Integer> ite=map.keySet().iterator();
		while(ite.hasNext()) {
			int key=ite.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
	}

}
