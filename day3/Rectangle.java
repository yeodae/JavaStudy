package day3;
import java.util.Scanner;
public class Rectangle {
	int width;
	int height;
	
	public int getArea(){
		return width*height;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Rectangle rect = new Rectangle();
		Scanner scan = new Scanner(System.in);
		System.out.println("�ʺ� �Է����ּ���>>");
		rect.width = scan.nextInt();
		System.out.println("���̸� �Է����ּ���>>");
		rect.height= scan.nextInt();
		System.out.println("������ �� : "+rect.getArea());
		scan.close();//OS�ڿ��� �ٽ� �ǵ����°�.

	}

}
