package day5_Linklist;

class MethodOverrideingEx{
	static void paint(Shape p){
		p.draw(); // p�� ����Ű�� ��ü ���� �������̵��� draw() ȣ��. ~���� ���ε�
	}
	public static void main(String[] args){
		Line line = new Line();
		paint(line);
		paint(new Shape());
		paint(new Line());
		paint(new Rect());
		paint(new Circle());
	}
}