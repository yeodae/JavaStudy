package day6_2;

public class Wrapper {//�⺻ Ÿ���� ���� ��ü�� �ٷ� �� �ְ� ��
	public static void main(String[] args) {

		String a= "100"; // ���ڿ� a
		int b = Integer.parseInt(a);
		// ���ڿ� a�� 10�� ������ ��ȯ
		System.out.println(b);

		String money="10,000";
		money = money.replace(",","");//,ǥ ����
		int c = Integer.parseInt(money);
		System.out.println(c); //10000 ���
		
		//=========�ڽ̰� ��ڽ�===========
		
		int n = 10;
		Integer intObject = n; // �ڽ� 
		System.out.println("intObject = "+intObject);
		
		int m = intObject + 10; // ��ڽ�
		System.out.println("m = "+m);
		
		//========��Ʈ�� ���ͷ��� new String();========
		String s1 = "ȫ�浿";
		String s2 = "ȫ�浿"; //==s1 ���� ���ͷ�
		String s3 = new String("ȫ�浿");
		
		System.out.println(s1==s3);//false
		System.out.println(s1.equals(s3));//true
		//equals�� ���� ���ڿ��� ~ ������ �̰Ž��
		
//		s1 = s1 + " �ٺ� ";
		s1 = s1.concat(" �ٺ�"); //���ڿ��� �̾���ϼ� �ִ�.
		System.out.println(s1);
		
		//�پ��� String �޼��� Ȱ��
		String j1 = "  Java Programming  ";
		System.out.println(j1.toLowerCase());//�ҹ���
		System.out.println(j1.toUpperCase());//�빮��
		System.out.println(j1.trim());//�յ� ��������
		
		System.out.println(j1.trim().toLowerCase());
		
		//���ڿ� �� : int compareTo(String anotherString)
		//���������� ��������, ���߿� ������ �������
		String java = "Java";
		String cpp = "C++";
		int res = java.compareTo(cpp);
		if(res == 0){ // java�� c++���� ������ ���߿� �����⶧���� ��� ����
			System.out.println("the same");
		}else if(res < 0){
			System.out.println(java + " < " + cpp);
		} else 
			System.out.println(java + " > "+cpp);
		
		//���� >> class compareTo
		//��ĳ�ʷ� �ΰ��� ���ڿ� �Է¹ޱ�
		//�ҹ��ڴ� �빮�ڷ� �ٲ㼭 ��
		//Test, test�� ���� ��
		
		
	}
}
