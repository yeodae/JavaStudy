package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner s=new Scanner(System.in);

		for(int i=0; i<2; i++){
			HashMap<String, Object> v = new HashMap<>();
			System.out.println((i+1)+"��° ����� ���� �Է�");
			
			System.out.println("�̸�>>");
			v.put("name",s.next());
			System.out.println("����>>");
			v.put("age",s.nextInt());
			System.out.println("����>>");
			v.put("gender",s.next());
			System.out.println("�ּ�>>");
			v.put("addr",s.next());
			list.add(v);//ArrayList i��° �迭�� �Է�
		}


		for(int i=0; i<list.size(); i++){
			System.out.print("�̸� : "+list.get(i).get("name"));
			System.out.print(", ���� : "+list.get(i).get("age"));
			System.out.print(", ���� : "+list.get(i).get("gender"));
			System.out.print(", �ּ� : "+list.get(i).get("addr"));
			System.out.println();
		}
//		HashMap<String, Object> map = list.get(i);
//		System.out.print("�̸� : " + map.get("name"));
//		System.out.print(", ���� : " + map.get("age"));
//		System.out.print(", ���� : " + map.get("gender"));
//		System.out.print(", �ּ� : " + map.get("addr"));
//		System.out.println();

	}

}
