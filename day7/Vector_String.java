package day7;

import java.util.Vector;

public class Vector_String {
	public static void main(String[] args) {
		Vector<String> s = new Vector<>();
		
		s.add(new String("ȫ�浿"));
		s.add("���缮");//new String ��������
		s.add("��ȣ��");
		
		System.out.println("��ü �� ��� ���� : "+s.size());
		
		s.add(2,"�ڸ��"); //�߰���� �߰�
		s.remove("ȫ�浿"); //��Ұ� ����
		
		
		for(int i=0; i<s.size(); i++){
//			String p = s.get(i);
//			System.out.println(p);
			System.out.println(s.get(i));
		}

	}

}
