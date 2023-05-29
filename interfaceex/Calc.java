package interfaceex;

public interface Calc {
	
	double PI=3.14;
	int ERROR = -9999999;
	
	int add(int num1, int num2);
	int substract(int num1, int num2);
	int times(int num1, int num2);
	int divide(int num1, int num2);
	
	int square(int num1);
	
	default void description ( ){
		System.out.println("정수 계산기를 구현합니다.");
		myMethod(); //디폴트 메서드에서 private 메서드 호출
	}
	
	static int total(int[] arr){
		int total=0;
		
		for(int i : arr){
			total += i;
		}
		myStaticMethod();//정적 메서드에서 private static메서드호출
		return total; // 인터페이스에 정적 메서드 total() 구현
	}
	
	static void myMethod() {
		System.out.println("private 메서드 입니다.");
	}//자바 8버전이라 private를 사용하면 에러,,
	static void myStaticMethod() {
		System.out.println("private static 메서드입니다.");
	} 
}
