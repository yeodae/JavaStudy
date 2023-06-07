package day7_extends;

public class PersonMain {
	//�޼��� ���� (info)
	//person�� ��ӹ޾Ƽ� ������� Ŭ�������� ��ü��
	//�Ű�����(�Ķ����)�� �޴� �ż���
	static void info(Person p){ //��ĳ����
		//Student ��ü�� �Ѿ���� "�л� �Դϴ�." ���� ���
		//StudentWorker ��ü�� �Ѿ���� "������ �Դϴ�." ���� ���
		//Rearcher ��ü�� �Ѿ���� "������ �Դϴ�." ���� ���
		//Professor ��ü�� �Ѿ���� "���� �Դϴ�." ���� ���
		if(p instanceof StudentWorker){
			System.out.println("������ �Դϴ�..");
			StudentWorker obj = (StudentWorker)p;
			obj.work();//�ٿ�ĳ���� 
		
		}else if(p instanceof Student){
			System.out.println("�л� �Դϴ�.");
			Student obj = (Student)p; 
			obj.study();//�ٿ�ĳ���� 
		}else if(p instanceof Professor){
			System.out.println("���� �Դϴ�.");
			Professor obj = (Professor)p;
			obj.teach();//�ٿ�ĳ���� 
		}else if(p instanceof Researcher){
			System.out.println("������ �Դϴ�.");
			Researcher obj = (Researcher)p;
			obj.res();//�ٿ�ĳ���� 
		}
		
//		p.info();
		
	}

	public static void main(String[] args) {
		//Student ��ü�� Person������ ��ĳ����.
		//Student s; // ��ü ���۷��� ���� , ��ü������ �ƴ�.
		Student s = new Student();//��ü����
//		Person s = new Student(); //Person������ ��ĳ����
//		
		Researcher r = new Researcher();
		StudentWorker w = new StudentWorker();
		Professor pr = new Professor();
		
//		Object obj = new Professor();
		//ObjectŬ������ ��� Ŭ������ �θ�Ŭ���� �̱⶧����
		//��� Ŭ������ ��ĳ������ �����ϴ�.
		
		info(s);
		info(w);
		info(r);
		info(pr);

	}
}
