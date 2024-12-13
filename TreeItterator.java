package collections;


import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeItterator {

	public static void main(String[] args) {
		Map<Integer,String> map = new TreeMap();
		map.put(1, "Momo Ayase");
		map.put(2, "Turbo Granny");
		map.put(3, "Ken Takakura");
		map.put(4, "Aira");
		map.put(5, "Alien");
		System.out.println(map);
		Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
		while (it.hasNext()) {
			Map.Entry<Integer,String> entry =  it.next();
			System.out.println(entry.getKey()+" "+entry.getValue());
			
		}
	}

}
