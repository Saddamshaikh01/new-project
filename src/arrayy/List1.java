package arrayy;

import java.util.ArrayList;
import java.util.Collection;

public class List1 {

	public static void main(String[] args) {
		ArrayList<Integer> list=new ArrayList<Integer>();
		
		
		list.add(3);
		list.add(4);
		list.add(8);
		list.add(5);
		list.add(1);
		
		System.out.println(list);
		System.out.println(list.size());
		
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
			
		}
		list.remove(3);
		System.out.println(list);
		System.out.println(list.get(3));
		list.set(1, 100);
		System.out.println(list);
		System.out.println(list.size());
		list.remove(0);
		System.out.println(list);

	}

}
