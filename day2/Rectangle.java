package day2;
import java.util.Scanner;
public class Rectangle {
	int width;
	int height; //����2���� 

	public int getArea() { // �ϳ��� �޼���� �̷���� Ŭ����.
		return width * height;//�������
	}

	public static void main(String[] args) {
		Rectangle rect = new Rectangle(); // ��ü ����
		Scanner scanner = new Scanner(System.in);
		System.out.print(">> ");
		rect.width = scanner.nextInt();
		rect.height = scanner.nextInt();
		System.out.println("�簢���� ������ " + rect.getArea());
		scanner.close();//OS�ڿ��� �ٽ� �ǵ����°�.
	}
}
