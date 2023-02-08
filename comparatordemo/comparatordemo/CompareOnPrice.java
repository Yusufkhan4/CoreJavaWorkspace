package comparatordemo;

import java.util.Comparator;

import assignment6.Book1;

public class CompareOnPrice implements Comparator<Book1>{

	@Override
	public int compare(Book1 b1, Book1 b2) {
		double diff=b1.getBookPrice()-b2.getBookPrice();
		return (int)diff;
	}

}