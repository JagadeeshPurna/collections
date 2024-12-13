package collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapExamples {

	public static void main(String[] args) {
		Map<Integer,String> map = new HashMap();
		map.put(1, "abc");
		map.put(2, "def");
		map.put(3, "ghi");
		map.put(4, "jkl");
		map.put(5, "mno");
		System.out.println(map);
    Iterator<Map.Entry<Integer,String>> it = map.entrySet().iterator();
    while (it.hasNext()) {
		Map.Entry<Integer,String> entry =  it.next();
		System.out.println(entry.getKey()+" "+entry.getValue());
		
	}
	}

}
