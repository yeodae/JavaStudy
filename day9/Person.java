package day9;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
	String name;

	int result(String name){
		Scanner s = new Scanner(System.in);
		System.out.print(name+"�� ���� ������ �����̿���");
		s.nextLine();
		Calendar now = Calendar.getInstance();//����
		int s1 = now.get(Calendar.SECOND);//���µ� �� �Է�
		System.out.println("���� �� : " + s1);
		System.out.print("10�ʿ� ������ enter ������");
		s.nextLine();
		now = Calendar.getInstance();
		int s2 = now.get(Calendar.SECOND);
		System.out.println("������ �� : " + s2);
		int sen = (s2 > s1) ? s2-s1 : (s2+60) - s1;
		int num1 = Math.abs(10-sen); 
		System.out.println(name+"�� ���̴� " + sen);
		return sen;
		
	}
	
}
