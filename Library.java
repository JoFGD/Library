package books;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Library {
	private static List<Book> Collection = new ArrayList<Book>();
	
	public static void addBook(Book book) {
		Collection.add(book);
	}
	
	public static void removeBook(Book book) {
		Collection.remove(book);
	}
	
	public static void printSortedCollection() {
		Collections.sort(Collection, new SortByISBN());
		
		for (Book book: Collection){
			book.printDetails();
			System.out.println();
		}
	}
	
	public static void printSummary(){
		Map<String, Integer> tempMap = new HashMap<String, Integer>();
		
		for (Book book: Collection) {
			Integer x = tempMap.get(book.getBookTitle());
			
			if (x == null) {
				x = 1;
			} else {
				x++;
			}
			
			tempMap.put(book.getBookTitle(), x);
		}
		
		for (Map.Entry<String, Integer> v: tempMap.entrySet()) {
			System.out.println("Book Title: "+v.getKey());
			System.out.println("Number of Books: "+v.getValue());
			System.out.println();
		}
	}
	
	public static void filterCollection(String string) {
		List<Book> result = Collection.stream()
		.filter(x -> x.getISBN_10().contains(string))
		.collect(Collectors.toList());
		
		for (Book book: result) {
			book.printDetails();
			System.out.println();
		}
	}
	
	public static void main(String[] args) {

	}
	
}