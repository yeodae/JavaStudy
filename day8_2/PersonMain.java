package day8_2;
import java.util.*;
public class PersonMain {
	

	public static void main(String[] args) {
		HashMap<String,Person> map = new HashMap<>();
		Scanner s=new Scanner(System.in);
		
		while(true){
			System.out.println("(1)�Է�, (2)����, (3)���, (4)���� :");
			int input = s.nextInt();
			
			if(input == 1){
//				HashMap<String,Person> map = new HashMap<>();
				System.out.println("�̸� �Է�");
				String name = s.next();
				System.out.println("���� �Է�");
				int age = s.nextInt();
				System.out.println("�ּ� �Է�");
				String addr = s.next();
				
				Person p = new Person(name,age,addr);
				map.put(name,p);
				
			}else if(input == 2){
				System.out.println("������ ȸ�� �̸��Է�");
				String name=s.next();
				if(map.containsKey(name)){
					map.remove(name);
				}
				
				
			}else if(input == 3){//Iterator�� �̿��� ��� ���ڿ� ���
				Set<String> keys = map.keySet();
				//key ���ڿ��� ������� ������ �� �ִ� Iterator ����
				Iterator<String> it = keys.iterator();
				
				while(it.hasNext()){
//					System.out.println(it.next());//ȫ�浿
					Person p = map.get(it.next());
					System.out.print("�̸� : "+p.getName());
					System.out.print(", ���� : "+p.getAge());
					System.out.print(", �ּ� : "+p.getAddr());
					System.out.println();
				}
				
			}else if(input == 4){
				System.out.println("�����մϴ�.");
				break;
			}
		}
		
		
	}

}
