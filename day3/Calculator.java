package day3;
//4. Calculator Ŭ���� ����
//1. �ΰ��� ������ �Ű������� �޾Ƽ� ���� ���� �������ִ� multiple �޼ҵ� ����
//2. 3���� ������ �Է¹޾Ƽ� ���� ���� �������ִ� multiple �޼ҵ� ����
//3. 4���� �Ǽ�(double)�� �Է¹޾Ƽ� ���� ū ���� �������ִ� max �޼ҵ� ����
public class Calculator {
	int multiple(int x,int y){
		return x*y;
	}
	int multiple(int x,int y,int z){
		return x*y*z;
	}
	double max(double a,double b,double c,double d){
		double x=Math.max(a, b);
		double y=Math.max(c, d);
		return Math.max(x, y);
		//return Math.max(Math.max(c, d),Math.max(a, b));	
	}

	

	public static void main(String[] args){
		Calculator calc=new Calculator();
		System.out.println(calc.multiple(2,2));
		System.out.println(calc.max(1.1, 2.2, 3.3, 4.4));
	} 
}