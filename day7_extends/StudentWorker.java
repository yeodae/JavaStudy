package day7_extends;

public class StudentWorker extends Student {
	private int empNum; // ���
	void work(){
		System.out.println("���ϱ�");
	}
	void info(){
		System.out.println("������ �Դϴ�.");
	}
	public static void main(String[] args) {
		StudentWorker w = new StudentWorker();
		w.say();
		w.eat();
		w.walk();
		w.sleep();
		w.study();
		w.work();
	}
}
