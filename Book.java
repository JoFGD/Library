package books;

public class Book {
	private String authorName;
	private String bookTitle;
	private String ISBN_10;
	
	Book(String name, String title, String ISBN){
		setAuthorName(name);
		setBookTitle(title);
		setISBN_10(ISBN);
	}
	
    public void printDetails() {
    	System.out.println("Author Name: "+getAuthorName());
    	System.out.println("Book Title: "+getBookTitle());
    	System.out.println("ISBN-10: "+getISBN_10());
    }
    
	public String getAuthorName() {
		return authorName;
	}
	
	public void setAuthorName(String authorName) {
		if (authorName != "") {
			for (int i=0;i<authorName.length();i++) {
				char c = authorName.charAt(i);
				
				if (Character.isAlphabetic(c)||Character.isWhitespace(c)||Character.isDigit(c)) {
					continue;
				}
				
				throw new IllegalArgumentException("Author name must only include Alphabetic, Numeric, or Whitespace characters.");
			}
		} else {
			throw new IllegalArgumentException("Author name must include at least one character.");
		}
		this.authorName = authorName;
	}
	
	public String getBookTitle() {
		return bookTitle;
	}
	
	public void setBookTitle(String bookTitle) {
		if (bookTitle != "") {
			this.bookTitle = bookTitle;
		} else {
			throw new IllegalArgumentException("Book title must include at least one character.");
		}
	}
	
	public String getISBN_10() {
		return ISBN_10;
	}
	
	public void setISBN_10(String ISBN) {
		if (ISBN.length() == 10) {
			int mulValue = 10;
			int total = 0;
			
			for (int i=0; i<9; i++) {
				char c = ISBN.charAt(i);
				
				if (Character.isDigit(c)) {
					total += mulValue*Character.getNumericValue(c);
				} else {
					throw new IllegalArgumentException("ISBN-10 must only have 9 digits and an X at the end.");
				}
				
				mulValue--;
			}
			
			if (ISBN.charAt(9) == 'X') {
				total += 10;
				
				if (total%11 != 0) {
					throw new IllegalArgumentException("ISBN-10 summation must be divisible by 11, please reformat input.");
				}
				
			} else {
				throw new IllegalArgumentException("ISBN-10 must have an X at the end.");
			}
		} else {
			throw new IllegalArgumentException("ISBN-10 must include 10 characters.");
		}
		this.ISBN_10 = ISBN;
	}
	
	public static void main(String[] args) {

	}

}