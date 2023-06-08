package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex3 {
	static int score(Scanner s, String kind, int limit){
		System.out.println(kind + "���� �Է�");
		int num;
		while(true){
			num=s.nextInt();
			if(num > limit || num <0 ){
				System.out.println("0~"+limit);
			}else {
				break;
			}
		}		
		return num;
	}
	public static void main(String[] args) {
		ArrayList<HashMap<String,Object>> list = new ArrayList<>();
		//HashMap<String,Object> v = new HashMap<>();
		Scanner s=new Scanner(System.in);
		
		while(true){
			System.out.println("(1)�Է�, (2)����, (3)���, (4)���� :");
			int input = s.nextInt();
			
			if(input == 1){//�Է�
				HashMap<String,Object> v = new HashMap<>();
				System.out.println("�̸� �Է�");
				v.put("name",s.next());
				System.out.println("���� �Է�");
				v.put("age",s.nextInt());
				
//				System.out.println("JAVA���� �Է�");
//				while(true){
//				int j=s.nextInt();
//				if(0<=j && 100>=j){
//					v.put("java", j);
//					break;
//				}else System.out.println("0~100 �ٽ� �Է�");
//				}
				v.put("java",score(s,"�ڹ�",100));
			
//				System.out.println("����Ŭ ���� �Է�");
//				while(true){
//				int o=s.nextInt();
//				if(0<=o && 100>=o){
//					v.put("oracle", o);
//					break;
//				}else System.out.println("0~100 �ٽ� �Է�");
//				}
				v.put("oracle", score(s, "����Ŭ", 100));
				v.put("html", score(s,"HTML",80));
				list.add(v);//v�� list�� ����
				
			}else if(input == 2){//����
				System.out.println("������ ȸ���� �̸��� ���̸� �Է����ּ���.");
				String name=s.next();
				int age=s.nextInt();
				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);
					if(v.get("name").equals(name) && v.get("age").equals(age)){
						list.remove(i);
						System.out.println("�����Ϸ�");
					}
				}
				
				
			}else if(input == 3){//���
				for(int i=0; i<list.size(); i++){
					HashMap<String,Object> v = list.get(i);
					System.out.print("�̸� : "+v.get("name"));
					System.out.print(", ���� : "+v.get("age"));
					System.out.print(", �ڹ����� : "+v.get("java"));
					System.out.print(", ����Ŭ���� : "+v.get("oracle"));
					System.out.println(", HTML���� : "+v.get("html"));
					System.out.println();
				}
				
			}else if(input == 4){//����
				System.out.println("����Ǿ����ϴ�.");
				break;
			}
		}
	}

}
