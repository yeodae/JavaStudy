package day7;

import java.util.HashMap;
import java.util.Scanner;

public class HashMapScoreEx {

	public static void main(String[] args) {
		//����� �̸��� ������ ����ϴ� hashmap �÷��� ����
		HashMap<String,Integer> v = new HashMap<>();
		Scanner s = new Scanner(System.in);
		//5���� ���� ����
		v.put("������",97);
		v.put("Ȳ����",88);
		v.put("������",65);
		v.put("�ռ���",76);
		v.put("������",95);
		
		System.out.println("HashMap�� ��� ���� : "+v.size());
		
		while(true){
			System.out.println("�ش� �л� ��������, ������� exit�Է�");
			String name = s.next();
			if(name.equals("exit")){
				System.out.println("�����մϴ�.");
				break;
			}
			if(v.containsKey(name)){
				System.out.println(v.get(name));
//			if(name.equals(v.get(name))){
//				v.get(name);
			}else
				System.out.println("�߸��� �Է��Դϴ�.");
		}
	}

}
