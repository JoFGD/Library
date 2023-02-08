package books;

public class PhysicalBook extends Book{
	private int numberOfPages;
	
	PhysicalBook(String name, String title, String ISBN, int numPages){
		super(name, title, ISBN);
		
		setNumberOfPages(numPages);
	}

	public void printDetails() {
    	super.printDetails();
    	System.out.println("Number of Pages: "+getNumberOfPages());
    }
	
	public int getNumberOfPages() {
		return numberOfPages;
	}
	
	public void setNumberOfPages(int numberOfPages) {
		this.numberOfPages = numberOfPages;
	}
	
	
}
