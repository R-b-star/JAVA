package deep;

public class Book {

	String title;
	int pages;
	
	public Book(String title, int pages) {
		this.title= title;
		this.pages= pages;
	}
	
	public void describe() {
		System.out.println(title + " has " + pages + " pages.");
	}
}
