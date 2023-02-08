package books;

public class AudioBook extends Book{
	private int timeLength;
	private double fileSize;
	
	AudioBook(String name, String title, String ISBN, double size, int time){
		super(name, title, ISBN);
		
		setTimeLength(time);
		setFileSize(size);
	}
	
	public void printDetails() {
    	super.printDetails();
    	System.out.println("File Size: "+getFileSize());
    	System.out.println("Duration: "+getTimeLength());
    }

	public int getTimeLength() {
		return timeLength;
	}

	public void setTimeLength(int timeLength) {
		this.timeLength = timeLength;
	}

	public double getFileSize() {
		return fileSize;
	}

	public void setFileSize(double fileSize) {
		this.fileSize = fileSize;
	}
	
	
}
