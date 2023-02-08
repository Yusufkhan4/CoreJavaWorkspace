package List;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Enumeration;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.TreeSet;
import java.util.Vector;

interface DemoInterface1  
{  
public default void display()   
{  
System.out.println("the display() method of DemoInterface1 invoked");  
}  
}  
interface DemoInterface2  
{  
public default void display()   
{  
System.out.println("the display() method of DemoInterface2 invoked");  
}  
}  

class DemoClass implements DemoInterface1, DemoInterface2  
{  
	public void display()   
	{  
	DemoInterface1.super.display();  
	DemoInterface2.super.display();  
	}  
}

class MyComparator implements Comparator{

	@Override
	public int compare(Object o1, Object o2) {
		String s1 = (String) o1;
		String s2 = (String) o2;
		return s2.compareTo(s1);
	}
}

public class Enum {

	public static void main(String[] args) {
		
//		enumeration
//		Vector v = new Vector();
//		
//		for(int i=0;i<=10;i++) {
//			v.addElement(i);
//		}
//		System.out.println(v);
//		
//		//initialize the enumeration
//		Enumeration e = v.elements();
//		while(e.hasMoreElements()) {
//			Integer i = (Integer) e.nextElement();
//			if(i%2==0)
//				System.out.println(i);
//		}
//		System.out.println(v);
		
		
//		iterator
//		ArrayList ar = new ArrayList();
//		for(int i=0;i<=10;i++) {
//			ar.add(i);
//		}
//		System.out.println(ar);
//		
//		Iterator itr = ar.iterator();
//		
//		while(itr.hasNext()) {
//			Integer i = (Integer)itr.next();
//			if(i%2==0) {
//				System.out.println(i);
//			}else {
//				itr.remove();
//			}
//		}
//		System.out.println(ar);
		
//		ListIterator
//		LinkedList l = new LinkedList();
//		l.add("Balakrishna");
//		l.add("venki");
//		l.add("chiru");
//		l.add("nag");
//		
//		System.out.println(l);
//		ListIterator litr = l.listIterator();
//		while(litr.hasNext()) {
//			String s = (String)litr.next();
//			if(s.equals("venki")) {
//				litr.remove();
//				litr.add("venki");
//			}
//			if(s.equals("chiru")) {
//				litr.set("chran");
//			}
//			if(s.equals("nag")) {
//				litr.add("chandra");
//			}
//		}
//		
//		System.out.println(l);
		
/////////////////////////////////
//		DemoClass obj = new DemoClass();   
//		//calling method  
//		obj.display();   
	
//////////////////////////////////HashSet
//		HashSet h = new HashSet();
//		h.add("Sree");
//		h.add(1);
//		h.add("lokesh");
//		h.add(null);
//		h.add(3);
//		h.add(null);
//		h.add("lokesh");
//		System.out.println(h.add(null));
//		System.out.println(h);

///////////////////////////////LinkedHashSet
//		LinkedHashSet h = new LinkedHashSet();
//		h.add("Sree");
//		h.add(1);
//		h.add("lokesh");
//		h.add(null);
//		h.add(3);
//		h.add(null);
//		h.add("lokesh");
//		System.out.println(h.add(null));
//		System.out.println(h);
		
/////////////////////////TreeSet
//		TreeSet t = new TreeSet();
//		t.add(null);
//		t.add("Sree");
//		t.add("Yusuf");
//		t.add("Munaf");
//		t.add("lokesh");
//		t.add(null);
//		System.out.println(t);
//		t.add(new StringBuffer("A"));
//		 t.add(new StringBuffer("Z"));
//		 t.add(new StringBuffer("L"));
//		 t.add(new StringBuffer("B")); 
//		System.out.println(t);
		
///////////////////////////Comparable
		
//		System.out.println("A".compareTo("Z"));
		
		List t = new ArrayList(new MyComparator());
		t.add("Raj");
		t.add("shobha rani");
		t.add("gangaBhavani");
		t.add("rajakumari");
		t.add("ramulamma");
		
		System.out.println(t);
				
	}
	
}
