package day3;

public class Circle {
	int radius;
	String name;
	
	Circle(){
		System.out.println("�⺻ ������ ȣ��");
	}
	Circle(int radius){
		this.radius=radius;
	}
	Circle(int r, String n){
		radius = r;
		name = n;
		System.out.println("�Ű����� ������ ȣ��");
	}
}
//�������� ������ ��ü�ʱ�ȭ : ��ü�� �����ɶ� ȣ��ȴ�.
//������ �ۼ����� : �����ε��� �����ϴ�.
