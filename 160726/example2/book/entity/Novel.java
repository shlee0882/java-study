package example2.book.entity;

public class Novel extends Publication {

	private String author;
	private String genre;
	
	public Novel() {
		// TODO Auto-generated constructor stub
	}

	public Novel(String title, String publishingDate, int page, int price, String author, String genre) {
		super(title, publishingDate, page, price);
		// TODO Auto-generated constructor stub
		this.author = author;
		this.genre = genre;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public String getGenre() {
		return genre;
	}

	public void setGenre(String genre) {
		this.genre = genre;
	}

	
}
