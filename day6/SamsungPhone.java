package day6;

public class SamsungPhone implements PhoneInterface {

	@Override
	public void sencCall() {
		System.out.println("�츮������~");
	}

	@Override
	public void receiveCall() {
		System.out.println("��ȭ�� �Խ��ϴ�.");
	}
}
