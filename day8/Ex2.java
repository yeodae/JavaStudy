package day8;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Ex2 {
	public static void main(String[] args) {
		ArrayList<HashMap<String, Object>> list = new ArrayList<>();
		Scanner s=new Scanner(System.in);


		while(true){
			System.out.println("(1)�Է�, (2)����, (3)���, (4)���� :");
			int input = s.nextInt();
			//HashMap<String, Object> v = new HashMap<>();
			if(input==1){
				System.out.println("�Է� �κ�");
				//HashMap<String, Object> v = new HashMap<>();
				System.out.println("����� ���� �Է�");
				HashMap<String, Object> v = new HashMap<>();
				System.out.println("�̸�>>");
				v.put("name",s.next());
				System.out.println("����>>");
				v.put("age",s.nextInt());
				System.out.println("����>>");
				v.put("gender",s.next());
				System.out.println("�ּ�>>");
				v.put("addr",s.next());
				list.add(v);//ArrayList i��° �迭�� �Է�
			}else if(input==2){
				System.out.println("���� �κ�");
				System.out.println("������ ȸ���� �Է��ϼ���.");
//				String name=s.next(); �ߺ���Ӷ߸� ���
				for(int i=0; i<list.size(); i++){
					HashMap<String, Object> v = list.get(i);
					if(v.get("name").equals(s.next())){
						System.out.println("����");
						list.remove(i);
					}
				}
				//v.remove(v.get(s.next()));
				System.out.println("�ش� ȸ�� ���� �Ϸ�");

			}else if(input==3){
				System.out.println("��� �κ�");
				for(int i=0; i<list.size(); i++){
					System.out.print("�̸� : "+list.get(i).get("name"));
					System.out.print(", ���� : "+list.get(i).get("age"));
					System.out.print(", ���� : "+list.get(i).get("gender"));
					System.out.print(", �ּ� : "+list.get(i).get("addr"));
					System.out.println();
				}

			}else if(input==4){
				System.out.println("���� �κ�");
				System.out.println("���� ����Ǿ����ϴ�.");
				break;
			}
		}
	}
}
