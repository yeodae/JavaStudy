package day7_extends;

public class Student extends Person{
	void study(){
		System.out.println("�����ϱ�");
	}
	@Override
	void eat(){
		System.out.println("�޽��� �Խ��ϴ�");
	}
	void info(){
		System.out.println("�л� �Դϴ�.");
	}
	public static void main(String[] args) {
		Student s=new Student();
		s.say();
		s.eat();
		s.walk();
		s.sleep();
		s.study();
	}
	
	
	
}
