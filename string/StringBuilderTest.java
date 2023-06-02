package string;

public class StringBuilderTest {

	public static void main(String[] args) {
		String javaStr = new String("Java");
		System.out.println("javaStr ���ڿ� �ּ� : "+System.identityHashCode(javaStr));
		//�ν��Ͻ��� ó�� ���������� �޸� �ּ�.
		StringBuilder buffer = new StringBuilder(javaStr);
		//String���κ��� StringBuilder����
		System.out.println("���� �� buffer �޸� �ּ� : "+System.identityHashCode(buffer));
		//705927765
		//���ڿ� �߰�
		buffer.append(" and");
		buffer.append(" android");
		buffer.append(" programming is fun!!");
		System.out.println("���� �� buffer �޸� �ּ� : "+System.identityHashCode(buffer));
		//705927765 ���� ���� �ּ� ����.
		javaStr=buffer.toString();
		//String Ŭ������ ��ȯ
		System.out.println(javaStr);
		System.out.println("���� ������� javaStr���ڿ� �ּ� : "+System.identityHashCode(javaStr));
	}

}
