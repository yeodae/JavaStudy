package day8;

import java.util.ArrayList;
import java.util.HashMap;

public class HashMapEx {
	public static void main(String[] args) {
		HashMap<String,Object> hong = new HashMap<>();

		hong.put("name","ȫ�浿");
		hong.put("age",30);
		hong.put("addr","����");
		hong.put("phone","010-1234-5678");

		//�������� �����ϱ� ���� ArrayList Ȱ��
		ArrayList<HashMap<String,Object>> list =
				new ArrayList<>();
		list.add(hong);

		//System.out.println(hong);
		//={phone=010-1234-5678, name=ȫ�浿, addr=����, age=30}
		//��°��� ArrayList Index:0��°�� ����.
		//List �ȿ��ִ� Map = ��json��(���� ���� ���δ�.)
		
		for(int i=0; i<list.size(); i++){
			System.out.println("�̸� : "+list.get(i).get("name") +"\n���� : "+ list.get(i).get("age"));
		}
	}
}
