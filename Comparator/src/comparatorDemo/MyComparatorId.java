package comparatorDemo;

import java.util.Comparator;

public class MyComparatorId implements Comparator {

	@Override
	public int compare(Object obj1, Object obj2) {
		Books b1 = (Books)obj1;
		Books b2 = (Books)obj2;
		Integer id1 = (Integer)b1.getId();
		Integer id2 = (Integer)b2.getId();
		if(id1<id2) {
			return -1;
		}else if(id1>id2) {
			return 1;
		}else {
			return 0;
		}
		
		
	}

}
