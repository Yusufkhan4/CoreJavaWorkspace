package comparatordemo;

import java.util.Comparator;

import assignment6.Book1;

public class CompareOnName implements Comparator<Book1>{
	@Override
	public int compare(Book1 b1, Book1 b2) {
        int diff=b1.getBookName().compareTo(b2.getBookName());
		return diff;
	}

}