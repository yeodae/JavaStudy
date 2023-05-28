package study01;
import java.util.Random;
import java.util.Scanner;
public class Sample02 {

	public static void main(String[] args) {
		// UpAndDown Game
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		System.out.println("컴퓨터가 1~100중 랜덤한 숫자 하나를 정합니다.");
		int ran=r.nextInt(100)+1;//랜덤숫자 생성
		System.out.println("숫자를 입력해 맞춰주세요!");
		int count=1;
		while(true){
			System.out.println("1~100 숫자 입력");
			int input=s.nextInt();
			if(ran==input){
				System.out.println("정답! 도전횟수:"+count);
				break;
			}else if(ran>input){
				System.out.println("Up!");
				count++;
			}else{
				System.out.println("Down!");
				count++;
			}
		}		
	}
}
