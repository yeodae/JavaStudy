package day4;
import java.util.Scanner;
public class GradeMain {
	
	public static void main(String[] args) {
		   // TODO Auto-generated method stub
		   Scanner sc = new Scanner(System.in);
		   System.out.print("����, ����, ���� ������ 3���� ���� �Է� >> ");
		   int math = sc.nextInt();
		   int science = sc.nextInt();
		   int english = sc.nextInt();
		   Grade me = new Grade(math, science, english);
		   System.out.println("����� "+me.average()); // average()�� ����� ����Ͽ� ����   
		   sc.close();
		}
//		��� : ����, ����, ���� ������ 3���� ���� �Է� >> 90 88 96
//				����� 91
	

	}
	


