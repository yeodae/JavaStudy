package study01;
import java.util.Random;
import java.util.Scanner;
public class Sample01 {

	public static void main(String[] args) {
		// 랜덤 구구단 퀴즈
		Scanner s=new Scanner(System.in);//입력
		Random r=new Random();//랜덤 숫자
		
		while(true){
			System.out.println("문제 수를 입력해주세요.");
			int num=s.nextInt();//수 입력
			for(int i=0; i<num; i++){
				int rnum1=r.nextInt(8)+2;//문제입력
				int rnum2=r.nextInt(9)+1;
				System.out.print(rnum1+"x"+rnum2+"=");
				
				int dap=s.nextInt();
				if(dap==(rnum1*rnum2)){
					System.out.println("정답!");
				}else{
					System.out.println("오답. 정답은 "+(rnum1*rnum2)+"입니다.");
				}
			}
			System.out.println("계속하시겠습니까? 0을 입력시 종료합니다.");
			int exit=s.nextInt();
			if(exit==0){
				break;
			}
		}
		System.out.println("종료되었습니다.");
	}

}
