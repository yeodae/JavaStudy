package day4;

public class HumanMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Human hong = new Human("ȫ�浿");
		Human yu = new Human("���缮", "��õ");
		Human kang = new Human("��ȣ��", "����", "010-1234-5678");
		Human park = new Human("�ڸ��", "�λ�", "010-9876-4321", 50);
		
		System.out.println(hong.toString());
		System.out.println(yu.toString());
		System.out.println(kang.toString());
		System.out.println(park.toString());
	}

}
