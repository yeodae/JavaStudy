package day9;

import java.util.Calendar;
import java.util.Scanner;

public class Person {
	String name;

	int result(String name){
		Scanner s = new Scanner(System.in);
		System.out.print(name+"씨 엔터 누르면 시작이에요");
		s.nextLine();
		Calendar now = Calendar.getInstance();//리셋
		int s1 = now.get(Calendar.SECOND);//리셋된 초 입력
		System.out.println("현재 초 : " + s1);
		System.out.print("10초에 가깝게 enter 누르셈");
		s.nextLine();
		now = Calendar.getInstance();
		int s2 = now.get(Calendar.SECOND);
		System.out.println("마지막 초 : " + s2);
		int sen = (s2 > s1) ? s2-s1 : (s2+60) - s1;
		int num1 = Math.abs(10-sen); 
		System.out.println(name+"씨 차이는 " + sen);
		return sen;
		
	}
	
}
