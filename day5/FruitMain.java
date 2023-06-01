package day5;

public class FruitMain {//��ĳ���� ����
	//==========�޼���=====FruitŸ���� �Ű�����f
	static void pack(Fruit f){ //���� Ÿ������ ��ĳ����
		//System.out.println(f.getName()+"������ ��ҽ��ϴ�.");

		//����: 1000��¥�� �ٳ����� ��ҽ��ϴ�.
		//    2000��¥�� �������� ��ҽ��ϴ�.
		//    1500��¥�� ����� ��ҽ��ϴ�.
		int price=0;
		if(f instanceof Banana){//�ٿ�ĳ����
			Banana obj = (Banana)f;
			price = obj.getPrice();
		}
		if(f instanceof Orange){//�ٿ�ĳ����
			Orange obj = (Orange)f;
			price = obj.getPrice();
		}
		if(f instanceof Apple){//�ٿ�ĳ����
			Apple obj = (Apple)f;
			price = obj.getPrice();
		}
		System.out.println(price + "��¥�� " + f.getName()+"������ ��ҽ��ϴ�.");
	}

	public static void main(String[] args) {

		Banana banana = new Banana("�ٳ���","�����",1000);
		Orange orange = new Orange("������","��Ȳ��",2000);
		Apple apple = new Apple("���","������",1500);


		banana.view();
		orange.view();
		apple.view();

//		pack(banana);//��ĳ����
//		pack(orange);//��ĳ����
//		pack(apple);//��ĳ����


	}
}
