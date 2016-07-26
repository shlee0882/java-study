package example2.book.entity;

public class Magazine extends Publication {

	private String publishingPeriod;
	
	public Magazine() {
		// TODO Auto-generated constructor stub
	}

	public Magazine(String title, String publishingDate, int page, int price, String publishingPeriod) {
		super(title, publishingDate, page, price);
		// TODO Auto-generated constructor stub
		this.publishingPeriod = publishingPeriod;
	}

	public String getPublishingPeriod() {
		return publishingPeriod;
	}

	public void setPublishingPeriod(String publishingPeriod) {
		this.publishingPeriod = publishingPeriod;
	}
	

}
