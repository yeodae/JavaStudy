package day8_2;
// HashMap�� ��ü ����, �л� ���� ����
public class Human {
	private String name;
	private int age;
	private String addr;
	private int javaScore;
	
	public Human(String name, int age, String addr){
		this.name = name;
		this.age = age;
		this.addr = addr;
		
	} //set�� �����ڷ� �ֱ⶧���� get�޼��常 ����.

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}

	public int getJavaScore() {
		return javaScore;
	}
	public void setJavaScore(int javaScore){
		this.javaScore=javaScore;
	}

	
}
