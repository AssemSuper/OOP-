package lab4;

public class Textbook {
	private int isbn;
	private String title;
	private String authors;
	
	public Textbook(int isbn) {
		this.isbn=isbn;
	}
	public Textbook(int isbn,String title) {
		this(isbn);
		this.title=title;
	}
	public Textbook(int isbn,String title,String authors) {
		this(isbn,title);
		this.authors=authors;
	}
	public void setIsbn(int isbn) {
		this.isbn=isbn;
		}
	public int getIsbn() {
		return isbn;
		}
	public void setTitle(String title) {
		this.title=title;
	}
	public String getTitle() {
		return title;
	}
	public void setAuthors(String authors) {
		this.authors=authors;
	}
	public String getAuthors() {
		return authors;
	}
	public String toString() {
		return "The book isbn is "+isbn+"the title is "+title +"the authors is"+ authors;
	}
	public boolean equals(Object o) {
		if(o==null) return false;
		if(o==this) return true;
		Textbook t =(Textbook) o;
		return t.getTitle().equals(title);
	}
	
}
