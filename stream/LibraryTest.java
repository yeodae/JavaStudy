package stream;
import java.util.*;

public class LibraryTest {

	public static void main(String[] args) {
	List <Book> bookList = new ArrayList<>();
	
	bookList.add(new Book("자바",25000));
	bookList.add(new Book("파이썬",25000));
	bookList.add(new Book("안드로이드",25000));
		
	int totalPrice=bookList.stream().mapToInt(b->b.getPrice()).sum();
	System.out.println(totalPrice);
	bookList.stream().filter(b->b.getPrice()>=20000).map(b->b.getName()).sorted().forEach(s->System.out.println(s));
	}
}

