package study01;
import java.util.Random;
import java.util.Scanner;
public class Sample02 {

	public static void main(String[] args) {
		// UpAndDown Game
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		System.out.println("��ǻ�Ͱ� 1~100�� ������ ���� �ϳ��� ���մϴ�.");
		int ran=r.nextInt(100)+1;//�������� ����
		System.out.println("���ڸ� �Է��� �����ּ���!");
		int count=1;
		while(true){
			System.out.println("1~100 ���� �Է�");
			int input=s.nextInt();
			if(ran==input){
				System.out.println("����! ����Ƚ��:"+count);
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
