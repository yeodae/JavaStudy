package classex;

public class NewInstanceTest {
//PersonŬ������ �ν��Ͻ� �����ϱ�
	public static void main(String[] args)throws ClassNotFoundException,
	InstantiationException, IllegalAccessException	{
		Person person1 = new Person( );
		//�����ڷ� �����ϱ�
		System.out.println(person1);
		
		Class pClass = Class.forName("classex.Person");
		//PersonŬ���� �̸��� ����Ͽ� ClassŬ������ ��ȯ.
		Person person2 = (Person)pClass.newInstance();
		//ClassŬ������ newInstance()�޼��� ȣ���ϸ鼭
		//PersonŬ������ ����Ʈ �����ڰ� ȣ��Ǿ� �ν��Ͻ��� ����.
		//newInstance()�� ��ȯ���� Object�̹Ƿ� PersonŬ����
		//�� �ٿ� ĳ�����Ѱ��� �� �� �ֽ��ϴ�.
		System.out.println(person2);
		//ClassŬ������ newInstance()�޼���� �����ϱ�.
		
	}

}
