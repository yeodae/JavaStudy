package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayList_String {

	public static void main(String[] args) {
		//���ڿ��� ���԰����� ArrayList �÷��� ����
		ArrayList<String> a = new ArrayList<>();
		
		//Ű����κ��� 4���� �̸� �Է¹޾� ArrayList�� ����
		Scanner s = new Scanner(System.in);
		
		for(int i=0; i<4; i++){
			System.out.println("������ �̸��� �Է��ϼ���");
			String n = s.next();
			a.add(n);
		}
		
		//ArrayList�� ��� �ִ� ��� �̸� ���
		for(int i=0; i<a.size(); i++){
			System.out.println(a.get(i));
		}
		
		//���� �� �̸� ���
		int temp=0;
		for(int i=1; i<a.size(); i++){
			if(a.get(i).length()>a.get(temp).length()){
				temp=i;
			}
		}
		
		System.out.println("���� �� �̸��� : "+a.get(temp));

	}

}
