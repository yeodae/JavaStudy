package object;

public class EqualsTest {
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Student studentYeo=new Student (100,"������");
		Student studentLee= studentYeo;//�ּ� ����
		Student studentSang=new Student(100,"������");
		
		if(studentYeo == studentLee){//==��ȣ�� ��
			System.out.println("�ּ� studentYeo == studentLee");
		}else{
			System.out.println("�ּ� studentYeo != studentLee");
		}
		
		if(studentYeo.equals(studentLee)){//�޼���� ��
			System.out.println("�����մϴ�.studentYeo.equals(studentLee)");
		}else{System.out.println(
			"�������� �ʽ��ϴ�. studentYeo.equals(studentLee)");
		}
		
		if(studentYeo == studentSang){
			System.out.println("�ּ� studentYeo == studentSang");
		} else{
			System.out.println("�ּ� studentYeo != studentSang");
		}
		if(studentYeo.equals(studentSang)){
			System.out.println("������ studentYeo.equals(studentSang");
		}else{
			System.out.println("�������� ���� studentYeo.equals(studentSang");
		}
		
		System.out.println("studentYeo�� hashCode : "+studentYeo.hashCode());
		System.out.println("studentSang�� hashCode : "+studentSang.hashCode());
		//�� �л��� �������� ���� ������ ���� �ؽ��ڵ尪�� ��ȯ�Ѵ�.
		System.out.println("studentYeo�� ���� �ּҰ� : "+System.identityHashCode(studentYeo));
		System.out.println("studentSang�� ���� �ּҰ� : "+System.identityHashCode(studentSang));
		//�������δ� ������, ���� �޸� �ּҰ����δ� �ٸ� �ν��Ͻ��̴�.
	}

}
