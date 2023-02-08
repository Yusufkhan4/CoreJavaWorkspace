package comparatordemo;

import java.util.Comparator;

import assignment6.Book1;

public class CompareOnId implements Comparator<Book1>{
	@Override
	public int compare(Book1 b1, Book1 b2) {
		int diff=b1.getBookId()-b2.getBookId(); // 10, 14, 15  == 0
		return diff;
	}

}