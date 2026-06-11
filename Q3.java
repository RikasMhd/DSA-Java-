class Book{
	private String title,author;
	private int chapter;
	public Book(){}
	public Book(String title,String author,int chapter){
		this.title=title;
		this.author=author;
		this.chapter=chapter;
	}
	public String getTitle(){
		return this.title;
	}
	public String getAuthor(){
		return this.author;
	}
	public int getChapter(){
		return this.chapter;
	}
	public void setTitle(String title){
		this.title=title;
	}
	public void setAuthor(String author){
		this.author=author;
	}
	public void setChapter(int chapter){
		this.chapter=chapter;
	}
	public int getNoPages(){
		return getChapter()*25;
	}
	public String display(){
		return "Book Details [ Title : "+getTitle()+" , Author: "+getAuthor()+" , No of chapters: "+getChapter()+" No of Pages: "+getNoPages()+" ]";
	}
	
	
}
public class Q3{
	public static void main(String [] args){
		Book b1=new Book("Harry Potter ","Vijay",25);
		System.out.println(b1.display());
		System.out.println("");
		System.out.println("Author: "+b1.getAuthor());
		System.out.println("Title: "+b1.getTitle());
		System.out.println("No. of Chapter : "+b1.getChapter());
		System.out.println("No. of pages: "+b1.getNoPages());
	}
}