package day3;

public class Book {
	String title;
	String author;

	public Book(String title){//������1
		this(title, "���ڹ̻�");//������ �������� ù�ٿ� �;��Ѵ�.
//		this.title = title;//this.��ü = �ش簴ü�� �ǹ�
//		this.author = "���ڹ̻�"; 
//		System.out.println(title+" "+author);
	}
	public Book(String title, String author){//������2
		this.title = title;
		this.author = author;
		System.out.println(title+" "+author);
	}
}

