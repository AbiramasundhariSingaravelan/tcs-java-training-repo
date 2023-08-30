import java.util.Scanner;

abstract class Books
{
	String author;
	int price;
	public void getBookDetails()
	{
		Scanner s=new Scanner(System.in);
		System.out.println("Enter author Name");
		author=s.next();
		System.out.println("Enter price of the book");
		price=s.nextInt();
	}
	abstract void printDetails();
}
class PrintBooks extends Books
{
	public void printDetails()
	{
		System.out.println(author);
		System.out.println(price);
	}
}
public class Abstraction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PrintBooks pb=new PrintBooks();
		pb.getBookDetails();
		pb.printDetails();
	}

}
