// class Book{
	// private String title,author;
	// private int pubYear;
	
	// Book(String name,String author,int pubYear){
		// this.name=name;
		// this.author=author;
		// this.pubYear=pubYear;
	// }
	// public String getName(){
		// return this.name;
	// }
	// public int getAuthor(){
		// return this.author;
	// }
	// public int getPubYear(){
		// return this.pubYear;
	// }
	// public String display(){
		// return "Book Name is "+getName()+"\nAuthor is "+getAuthor()+"\nPublication Year of book : "+getPubYear();
	// }
	
	
// }
// import java.util.*;
// public class Q5{
	// public static void main(String[]args){
		// List<Book>book=new ArrayList<>();
	
		// public String addBooks(book b){
			// book.add(b);
			// System.out.print("Book added successfully.")
		// }
		// pubic String showBooks(){
			// for (Book b:book){
				// System.out.println(book[b]);
			// }
		// }
		// book.(new Book("hjkl","rikas",2000));
		
	// }
	

	
// }



import java.util.*;

class Book {
    private String title, author;
    private int pubYear;

    Book(String title, String author, int pubYear) {
        this.title = title;
        this.author = author;
        this.pubYear = pubYear;
    }

    public String getTitle() {
        return this.title;
    }

    public String getAuthor() {
        return this.author;
    }

    public int getPubYear() {
        return this.pubYear;
    }

    public String display() {
        return "Book Title: " + getTitle() +
               "\nAuthor: " + getAuthor() +
               "\nPublication Year: " + getPubYear();
    }
}

public class Q5 {

    private static List<Book> books = new ArrayList<>();

    public static void addBook(Book b) {
        books.add(b);
        System.out.println("Book added successfully.");
    }

    public static void showBooks() {
        for (Book b : books) {
            System.out.println(b.display());
            System.out.println("----------------");
        }
    }

    public static void main(String[] args) {

        addBook(new Book("Java Programming", "Rikas", 2000));
        addBook(new Book("Data Structures", "John Smith", 2015));

        showBooks();
    }
}
