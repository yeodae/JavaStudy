package interfaceex;

public class CompleteCalc extends Calculator {

	public void description(){
		super.description();//�������̵�:�� Ŭ�������� ���ϴ� ��� ������
	}
	
	@Override
	public int times(int num1, int num2) {
		// TODO Auto-generated method stub
		return num1 * num2;
	}

	@Override
	public int divide(int num1, int num2) {
		// TODO Auto-generated method stub
		if(num2 !=0)
			return num1 / num2;
		else
			return Calc.ERROR;
	}
	@Override
	public int square(int num1) {
		// TODO Auto-generated method stub
		return num1 * num1;
	}
	
	public void showInfo(){
		System.out.println("Calc �������̽��� �����Ͽ����ϴ�.");
	}

	
}