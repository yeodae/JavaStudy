package day3;
//1.����3��(int�� 2��, double�� 1��)
// sum �޼��� ȣ�� �� 3���� ���� ���Ͽ� ����.
//2.���� �޼��忡�� ��ü����.
//3.��ü�� �ִ� 3�� ������ ��ĳ�ʷ� �Է� �޾Ƽ� �ʱ�ȭ.
//4.sum �޼��� ȣ��
import java.util.Scanner;
public class MethodEx {
	int a;
	int b;
	double c;//��������
	
	public double sum(){//�޼������
		return a+b+c;
	}
	public static void main(String[] args) {
		MethodEx M=new MethodEx();//��ü����
		Scanner s=new Scanner(System.in);
		
		System.out.println("ù��°�� ���� ������ �Է����ּ���.");
		M.a =s.nextInt();
		System.out.println("�ι�°�� ���� ������ �Է����ּ���.");
		M.b =s.nextInt();
		System.out.println("���������� ���� �Ǽ��� �Է����ּ���.");
		M.c =s.nextDouble();
		System.out.println("�� ���� �� : "+M.sum());
		s.close();////OS�ڿ��� �ٽ� �ǵ����°�.

	}

}
