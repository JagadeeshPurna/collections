package collections;

import java.util.Iterator;
import java.util.Map;
import java.util.HashMap;

public class HashMapIterator {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap();
		map.put(1, "Momo ");
		map.put(2, "Turbo ");
		map.put(3, "Okarun");
		map.put(4, "Aira");
		map.put(5, "Jiji");
		System.out.println(map);
		Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer,String> entry =  it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}

}
