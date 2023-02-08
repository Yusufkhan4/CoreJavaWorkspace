package ComparableComparator;

import java.util.Comparator;
import java.util.TreeSet;

class Employee 
//implements Comparable
{
	int eid;
	String ename;

	public Employee(int eid, String ename) {
		super();
		this.eid = eid;
		this.ename = ename;
	}
	
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + "]";
	}
	
//	public int compareTo(Object obj1) {
//		int eid1 = this.eid;
//		Employee e = (Employee) obj1;
//		int eid2 = e.eid;
//		if(eid1 < eid2) return -1;
//		else if(eid1 > eid2) return 1;
//		else return 0;
//		
//		
//	}
}


class MyComparator implements Comparator{
	
	@Override
	public int compare(Object obj1, Object obj2) {
		
		
		return 
	}
	
}

public class CompCompDemo {
	public static void main(String[] args) {
		Employee e1 = new Employee(200, "nag");
		Employee e2 = new Employee(200, "balaih");
		Employee e3 = new Employee(50, "chiru");
		Employee e4 = new Employee(150, "venki");
		Employee e5 = new Employee(100, "nag");
		
		TreeSet t = new TreeSet(new MyComparator());
		t.add(e1);
		t.add(e2);
		t.add(e3);
		t.add(e4);
		t.add(e5);
		
		
		System.out.println(t);
		
		
		
	}
}
