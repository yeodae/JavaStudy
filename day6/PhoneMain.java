package day6;

public class PhoneMain {

	public static void main(String[] args) {
		SamsungPhone sPhone = new SamsungPhone();
		PhoneInterface phone;//��ü������ �Ұ�.���� ����
		phone = sPhone; // ��ĳ����
		
		phone.sencCall();
		phone.receiveCall();
	}
}
