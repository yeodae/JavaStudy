package day1;
import java.util.Random;
import java.util.Scanner;

public class UpAndDown {
	public static void main(String[] args) {
		Random r=new Random();
		Scanner s=new Scanner(System.in);
		
		System.out.println("1~100 ������ ���ڸ� ���߼���!");
		int fix=r.nextInt(100)+1;
		System.out.println("����!");
		int i=0;
		
		while(true){
			System.out.println("1~100 UpAndDown");
			int say=s.nextInt();
			if(say==fix){
				System.out.println("����! ����Ƚ��:"+i);
				break;
			}else if(say>fix){
				System.out.println("Down!");
				i++;
			}else if(say<fix){
				System.out.println("Up!");
				i++;
			}
		}
	}
}
