package day8_2;
import java.util.*;
public class CopyOfPersonMain2 {
	

	public static void main(String[] args) {
		HashMap<String,Person> map = new HashMap<>();
		Scanner s=new Scanner(System.in);
		
		while(true){
			System.out.println("1.�Է� 2.���� 3.��� 4.����");
			int input=s.nextInt();
			if(input == 1){
				System.out.println("�̸�");
				String name = s.next();
				System.out.println("����");
				int age = s.nextInt();
				System.out.println("�ּ�");
				String addr = s.next();
				
				Person p = new Person(name,age,addr);
				map.put(name, p);
				
			}else if(input == 2){
				System.out.println("������ ȸ�� �Է�");
				String name = s.next();
				if(map.containsKey(name)){
					map.remove(name);
					System.out.println("�����Ϸ�");
				}
				
			}else if(input == 3){
				Set<String> keys=map.keySet();
				Iterator<String> it=keys.iterator();
				
				while(it.hasNext()){
					Person p = map.get(it.next());
					System.out.println("�̸� : "+p.getName());
					System.out.println("���� : "+p.getAge());
					System.out.println("�ּ� : "+p.getAddr());
				}
			}else if(input == 4){
				System.out.println("����");
				break;
			}
		}
		
		
		
		
	}

}
