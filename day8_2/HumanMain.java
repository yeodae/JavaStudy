package day8_2;
// HashMap�� ��ü ����, �л� ���� ����
import java.util.*;
public class HumanMain {
	public static void main(String[] args) {
		HashMap<String,Human> map = new HashMap<>();
	
		Human hong = new Human("ȫ�浿",30,"����");
//		map.put("ȫ�浿", new Human("ȫ�浿",30,"����"));
		map.put("ȫ�浿",hong);
		
		map.put("���缮",new Human("���缮",40,"��õ"));
//		System.out.println(map.get("ȫ�浿").getAddr());
		//���� ���
		
		//ó���� ȫ�浿 , �״��� ���缮 �����ؼ�
		//��ĳ�ʷ� ���� �Է� �޾Ƽ� javaScore ä���.
//		Scanner s = new Scanner(System.in);
//		hong = map.get("ȫ�浿");
//		hong.setJavaScore(s.nextInt());
//		map.put("ȫ�浿",hong);
//		System.out.println(hong.getJavaScore());
		
		//keySet() �޼��� Ȱ��
		//
		Set<String> keys = map.keySet();
		// key ���ڿ��� ���� ���� Set �÷��� ����
		Iterator<String> it = keys.iterator();
		//key ���ڿ��� ������� ������ �� �ִ� Iterator ȣ��
		while(it.hasNext()){
			System.out.println(it.next());
		}
		
		
		
	}

}
