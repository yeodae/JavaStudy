package object;

public class Book {
	int bookNumber;
	String bookTitle;
	
	Book(int bookNumber, String bookTitle){
		this.bookNumber=bookNumber;
		this.bookTitle=bookTitle;
	}//å ��ȣ�� ������ �Ű������� �Է¹޴� ������

	@Override//toString() �޼��� ������
	public String toString() {
		// TODO Auto-generated method stub
//		return super.toString();
		return bookTitle + "," + bookNumber;
	}
}



