package day2;

public class CircleMain {

	public static void main(String[] args) {
		Circle pizza = new Circle(); // Circle ��ü ����
		pizza.radius = 10; // ������ �������� 10���� ����
		pizza.name = "�ڹ�����"; // ������ �̸� ����
		System.out.println(pizza.name+pizza.radius);

		double area = pizza.getArea(); // ������ ���� �˾Ƴ���
		//�����ִ� ���ϰ� area�� ���� return 3.14 * radius * radius;
		System.out.println(pizza.name + "�� ������ " + area);
		//���ϰ����� area ȣ��


		Circle donut = new Circle(); // Circle ��ü ����
		donut.radius = 2; // ������ �������� 2�� ����
		donut.name = "�ڹٵ���"; // ������ �̸� ����
		area = donut.getArea(); // ������ ���� �˾Ƴ���
		System.out.println(donut.name + "�� ������ " + area);


	}

}
