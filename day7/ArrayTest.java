package day7;

import java.util.ArrayList;
import java.util.Scanner;

public class ArrayTest {
	public static void main(String[] args) {
		ArrayList<Integer> v = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		int min=0;
		int count=0;
		for(int i=0; i<5; i++){
			System.out.println((i+1)+"�� �����Է�>>");
			v.add(s.nextInt());

			if(v.get(i)<v.get(min)){
				min=i;
				count=1; // �������� ������ ���� �ٽ� 1�� �ʱ�ȭ
			}
			//Math.min(min, v.get(i));
			else if(v.get(i)==v.get(min)){
				count++;
			}
		}
		System.out.println("���� ������ : "+v.get(min)+"\n�ߺ� ���� : "+count);
	}
}
