package arrayy;

import java.util.HashSet;
import java.util.Iterator;

public class HashSet1 {

	public static void main(String[] args) {
		HashSet<Integer> set=new HashSet<Integer>();
		
		set.add(2);
		set.add(5);
		set.add(6);
		set.add(8);
		set.add(7);
		
		/*System.out.println(set);
		System.out.println(set.contains(10));
		set.remove(5);
		System.out.println(set);
		System.out.println(set.size());*/
		
		Iterator<Integer> it=set.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}

	}

}
