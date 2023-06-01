package day5_Linklist;

public class UsingOverride {
	public static void main(String[] args) {
		Shape start,last,obj;
		//��ũ�� ����Ʈ�� ���� �����Ͽ� ����
		start=new Line(); // Line ��ü ����
		last = start;
		
		obj = new Rect(); // Rect ��ü ����
		last.next = obj;
		last = obj;
		
		obj = new Line(); // Line ��ü ����
		last.next = obj;
		last = obj;
		
		obj = new Circle();
		last.next = obj;
		last = obj; // null
		
		//��� ���� ���
		Shape p = start;
		while(p != null){
			p.draw();
			p = p.next;
			System.out.println(p);
		}
	}
}
