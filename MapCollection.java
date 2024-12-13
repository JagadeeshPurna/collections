package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;



public class MapCollection {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap();
		map.put(1, "Naruto Uzumaki");
		map.put(2, "Sasuke Uchiha");
		map.put(3, "Monkey D Luffy");
		map.put(4, "Zoro");
		map.put(5, "Pain");
		// map.put(null, null);
		Iterator it = map.keySet().iterator();
		while (it.hasNext()) {
			int key= (int)it.next();
			System.out.println(key);
			System.out.println(map.get(key));
		}
		Integer key = 20;
		int h = key.hashCode();
		long val = (key == null) ? 0 : (h = key.hashCode()) ^ (h >>> 16);
		System.out.println(val);
	}

}
