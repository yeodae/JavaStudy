package object;

public class ToStringEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book(200, "����");

		System.out.println(book1);
		//�ν��Ͻ� ����(Ŭ���� �̸�.�ּҰ�) ~ �ڵ����� toStringȣ��
		System.out.println(book1.toString( ));
		//toString()�޼���� �ν��Ͻ�����(Ŭ���� �̸�.�ּҰ�)�� ������
		
		Student studentYeo = new Student(130212,"������");
		System.out.println(studentYeo);
	}
}
