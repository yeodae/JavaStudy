package day6_2;
import java.util.Scanner;
public class compareTo {
	public static void main(String[] args) {
		
		//���� >>
				//��ĳ�ʷ� �ΰ��� ���ڿ� �Է¹ޱ�
				//�ҹ��ڴ� �빮�ڷ� �ٲ㼭 ��
				//Test, test�� ���� ��
		Scanner s = new Scanner(System.in);
		System.out.println("2�� ���ڿ� �Է�>>");
		String a=s.nextLine().toUpperCase();//�빮�ں�ȯ
		String b=s.nextLine().toUpperCase();//�빮�ں�ȯ
		// nextLine() ~ ���� �ص� �ش���� ��ü ���
		int res = a.compareTo(b);
		if(res == 0){
			System.out.println("the same");
		}else if(res < 0){
			System.out.println(a +" < "+b);
		}else
			System.out.println(a + " > "+b);
		//a�� �������� �������� a<b
		//a�� ���߿� ������ ������� a>b
		//======================
		
//		String s1 = "\t test \n";
//		String s2 = "   test   ";
//		System.out.println(s1.trim());
//		System.out.println(s2.trim()); //trim����
	}

}
