package arrayy;

import java.util.HashMap;

public class Hashmap1 {

	public static void main(String[] args) {
		HashMap<String,Integer> map= new HashMap<String,Integer>();
		map.put("CnG", 120);
		map.put("Patrol", 108);
		map.put("Desel", 100);
		map.put("LPG", 1080);
		
		System.out.println(map);
		System.out.println(map.get("LPG"));
		System.out.println(map.get("saddam"));
		System.out.println(map.containsKey("CnG"));
		map.remove("CnG");
		System.out.println(map);
	

	}

}
