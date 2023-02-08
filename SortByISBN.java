package books;

import java.util.Comparator;

public class SortByISBN implements Comparator<Book> {

	public int compare(Book o1, Book o2) {
		return o1.getISBN_10().compareToIgnoreCase(o2.getISBN_10());
	}


}
