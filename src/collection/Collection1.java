package collection;

import java.util.ArrayList;

public class Collection1 {

	public static void main(String[] args) {
		ArrayList A1=new ArrayList();
		A1.add(100);
		A1.add(200);
		A1.add(300);
		//System.out.println(A1);
		//System.out.println(A1.contains(200));
		//System.out.println(A1.contains(1000));
		//System.out.println(A1.isEmpty());
		//System.out.println(A1.size());
		A1.remove(0);
		System.out.println(A1);
		
		ArrayList A2=new ArrayList();
		A2.add("abc");
		A2.add("efg");
		A2.add("hij");
		System.out.println(A2);
		A2.remove("abc");
		System.out.println(A2);
		
		A1.addAll(A2);
		System.out.println(A1);
	

	}

}
