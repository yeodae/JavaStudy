package day6;

public class PointMain {
	public static void main(String[] args) {
		Point p = new Point(2,3);
		System.out.println(p.getClass().getName()); // Ŭ���� �̸�
		System.out.println(p.hashCode()); // �ؽ� �ڵ� ��
		System.out.println(p.toString()); 
		// ��ü�� ���ڿ��� ����� ��� //toString�� ������ �����ϴ�.
		System.out.println(p); // ��ü ��� = toString
		//=======================================
		Point p1 = new Point(2,3); 
		Point p2 = new Point(2,3);
		
		System.out.println(p1 == p2);//false
		System.out.println(p1.equals(p2));//false
		
	}
}
