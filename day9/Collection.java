package day9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;

public class Collection {

	static void printList(ArrayList<Integer> l){
		Iterator<Integer> it = l.iterator();
		while (it.hasNext()) {//������Ұ� �������� ���� boolean���� ��ȯ
			Integer n = it.next();
			String separator;
			if (it.hasNext()) {//������Ұ� �������� ���� boolean���� ��ȯ
				separator = "->";
			}else
				separator = "\n";
			System.out.print(n + separator);
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		
		ArrayList<Integer> list = new ArrayList<>();
		
		for (int i = 0; i < 5; i++) {
			list.add(s.nextInt());
		}
		
		Collections.sort(list);
		printList(list);//static���� ����Ǿ �޼ҵ� 
		
		Collections.reverse(list);
		printList(list);//static���� ����Ǿ �޼ҵ� s
		
		System.out.println("�Է��� �����߿� �ϳ��� �Է��ϼ���.");
		int i = s.nextInt();
		int index = Collections.binarySearch(list, i) + 1;
		System.out.println("�Է��ϴ°��� " + index + "��°�� �ֽ��ϴ�.");
	}
}
