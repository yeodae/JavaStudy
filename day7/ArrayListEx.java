package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayListEx {
	public static void main(String[] args) {
		ArrayList<String> a = new ArrayList<>();
		//ArrayList ���ڿ��� �����ϴ� ��ü ����
		
		Scanner s = new Scanner(System.in);
		//Scanner�� ���ڿ��� 5�� �Է¹޾Ƽ� ArrayList��ü�� ����
		
		for(int i=0; i<5; i++){
			System.out.print("�̸��� �Է����ּ���>>");
//			String in=s.next();
			a.add(s.next());
			}
		for(int i=0; i<a.size(); i++){
			System.out.println("�̸� : "+a.get(i));
			//ArrayList ��ü�� �ִ� ���ڿ� ���
		}

		int temp=0;
		for(int i=1; i<a.size(); i++){
			if(a.get(i).length() > a.get(temp).length()){
				temp=i;
				}
		}
		for(int i=0; i<a.size(); i++){
			if(a.get(temp).length()==a.get(i).length()){
				System.out.println(a.get(i));
			}
		}
//		System.out.println("���� �� �̸��� : "+a.get(temp));
//		System.out.println();
		
//		String str="";
//		for( int i =0; i<a.size(); i++){
//			if(str.length() < a.get(i).length()){
//				str=a.get(i);
//			}
//		}
//		System.out.println("���� �� �̸� : "+str);
	}
}
