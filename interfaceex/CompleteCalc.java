package interfaceex;

public class CompleteCalc extends Calculator {

	public void description(){
		super.description();//오버라이딩:현 클래스에서 원하는 기능 재정의
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
		System.out.println("Calc 인터페이스를 구현하였습니다.");
	}

	
}
