class BookDetails {
	private String title;
	private String author;
	private double price;
	
	public BookDetails(String title , String author, double price) {
		this.title=title;
		this.author = author;
		this.price = price;
	}
	public void showDetails() {
	System.out.println("The Book Title is : "+title+"\nAuthor : "+author+"\nPrice :"+price);
	}
	public static void main(String[]args){
		BookDetails book1 = new BookDetails("The Blue Umbrella","Ruskin Bond",150.0);
		book1.showDetails();
	}
}
/*
Output
The Book Title is : The Blue Umbrella
Author : Ruskin Bond
Price :150.0
*/