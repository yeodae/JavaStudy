package day4;

public class TestReturn {
	public void sum(int a, int b){
		int c = a + b;
		System.out.println(c);
	}
	//������ ������ = void 
	public int sum(int a, int b, int c){//�����ε�
		return a + b + c;
		//�����ʿ�
	}
}
