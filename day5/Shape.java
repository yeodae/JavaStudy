package day5;

public class Shape {
	public Shape next; 
	public Shape() { next = null; }
	public void draw() {
		System.out.println("Shape");
	}
}
class Line extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Line");
	}
}
class Rect extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Rect");
	}
}
class Circle extends Shape {
	public void draw() { // �޼ҵ� �������̵�
		System.out.println("Circle");
	}
}

class MethodOverridingEx {
	static void paint(Shape p) {
		p.draw(); // p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��. 
		// ���� ���ε�
	}
	public static void main(String[] args) {
		Line line = new Line();
		paint(line); 
		paint(new Shape()); 
		paint(new Line()); 
		paint(new Rect()); 
		paint(new Circle()); 
	}
}


class UsingOverride {
	public static void main(String [] args) {
		Shape start, last, obj;
		// ��ũ�� ����Ʈ�� ���� �����Ͽ� ����
		start = new Line(); // Line ��ü ����
		last = start;
		obj = new Rect();
		last.next = obj; // Rect ��ü ����
		last = obj;
		obj = new Line(); // Line ��ü ����
		last.next = obj;
		last = obj;
		obj = new Circle(); // Circle ��ü ����
		last.next = obj;
		// ��� ���� ���
		Shape p = start;
		while(p != null) {
			p.draw();
			p = p.next;
		}
	}
}

