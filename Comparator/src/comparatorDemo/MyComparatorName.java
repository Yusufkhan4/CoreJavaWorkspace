package comparatorDemo;

import java.util.Comparator;

public class MyComparatorName implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Books b1 = (Books)obj1;
		Books b2 = (Books)obj2;
		String s1 = (String)b1.getName();
		String s2 = (String)b2.getName();
		return s1.compareTo(s2);
	}

}
