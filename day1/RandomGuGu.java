package day1;
import java.util.Scanner;
import java.util.Random;
public class RandomGuGu {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		Random r=new Random();
		while(true){
			System.out.println("����帱���");
			int input=s.nextInt();
			for(int i=1; i<=input; i++){
				System.out.println(i+"�� ����");

				int a=r.nextInt(8)+2;
				int b=r.nextInt(9)+1;
				System.out.println(a+"x"+b+"=");
				int input2=s.nextInt();
				if(input2==a*b){
					System.out.println("����!");
				}else{
					System.out.println("����!");
				}
			}
			System.out.println("��, ���Ͻðڽ��ϱ�? 0������ ����");
			int exit=s.nextInt();
			if(exit==0){
				System.out.println("�����մϴ�.");
				break;
			}
		}
	}
}
