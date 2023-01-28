package collection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

public class Set1 {

	public static void main(String[] args) {
		List L1=new ArrayList();
		L1.add(10);
		L1.add(20);
		L1.add(40);
		L1.add(10);
		L1.add(10);
		L1.add(20);
		//L1.add(null);
		//L1.add(null);
		//System.out.println(L1);
		ListIterator itr=L1.listIterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
/////////////////////////////////////////////////		
		
		Set L2=new HashSet();
		L2.add(10);
		L2.add(50);
		L2.add(40);
		L2.add(null);
		L2.add(null);
		//System.out.println(L2);
		Iterator itr1=L2.iterator();
		while(itr1.hasNext()) {
			System.out.println(itr1.next());
		}

	}

}
