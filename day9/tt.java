package day9;

import java.util.Calendar;
import java.util.Scanner;

public class tt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s = new Scanner(System.in);
		System.out.print("1p 엔터 누르면 시작");
		s.nextLine();
		Calendar now = Calendar.getInstance();
		int s1 = now.get(Calendar.SECOND);
		System.out.println("현재 초 : " + s1);
		System.out.print("10초에 가깝게 enter 누르셈");
		s.nextLine();
		now = Calendar.getInstance();
		int s2 = now.get(Calendar.SECOND);
		System.out.println("마지막 초 : " + s2);
		int sen = (s2 > s1) ? s2-s1 : (s2+60) - s1;
		int num1 = Math.abs(10-sen); 
		System.out.println("1p 차이는 " + sen);
		
		System.out.print("2p 엔터 누르면 시작");
		s.nextLine();
		now = Calendar.getInstance();
		s1 = now.get(Calendar.SECOND);
		System.out.println("현재 초 : " + s1);
		System.out.print("10초에 가깝게 enter 누르셈");
		s.nextLine();
		now = Calendar.getInstance();
		s2 = now.get(Calendar.SECOND);
		System.out.println("마지막 초 : " + s2);
		int sen2 = (s2 > s1) ? s2-s1 : (s2+60) - s1;
		int num2 = Math.abs(10-sen2);
		System.out.println("2p 차이는 " + sen2);
		
		if(num1 == num2){
			System.out.println("비김");
		}
		else if(num2 > num1){
			System.out.println("1p 이김");
		}
		else{
			System.out.println("2p 이김");
		}
	}

}
