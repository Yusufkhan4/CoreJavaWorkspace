package List;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.RandomAccess;
import java.util.Set;

public class ArrayL {
	
	public static void main(String... a) {
		ArrayList<Integer> arr = new ArrayList<>();
		LinkedList l2 = new LinkedList();
		arr.add(1);
		arr.add(2);
		arr.add(3);
		
//		Iterator<Integer> itr = arr.iterator();
		System.out.println(l2 instanceof Serializable);
		System.out.println(arr instanceof Serializable);
		System.out.println(l2 instanceof Cloneable);
		System.out.println(arr instanceof Cloneable);
		System.out.println(l2 instanceof RandomAccess);
		System.out.println(arr instanceof RandomAccess);
		
		
//		while(itr.hasNext()) {
//			Integer i = itr.next();
//			if(i.equals(2)) {
//				itr.remove();
//			}else {
//				System.out.println(i);
//			}
//		}
//		
//		Set<Object> s = new HashSet<>()
	}

}
