package day8_2;
import java.util.*;
public class IteratorEx {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<Integer>();
		//v�� ���� 5�� �Է�

		v.add(5);
		v.add(3);
		v.add(2);
		v.add(4);
		v.add(1);

		//for(int i=0; i<v.size(); i++){
		//System.out.println(v.get(i));
		//}
		Iterator<Integer> it = v.iterator();
		// [5,3,2,4,1]
		while(it.hasNext()){//true~��it��ġ:-1��0��°�� �����Ƿ� 
			System.out.println(it.next());
			
		}
		//ArrayList<String> ����
		//���ڿ� 5�� ��ĳ�ʷ� �Է� �޾Ƽ� ����
		//Iterator ��ü�� ���ؼ� ���

		ArrayList<String> a = new ArrayList<>();
		Scanner s = new Scanner(System.in);
		for(int i=0; i<5; i++){
			System.out.println((i+1)+"��° �����Է�");
			a.add(s.next());
		}
		System.out.println(a);
		Iterator<String> str = a.iterator();
		while(str.hasNext()){
			System.out.println(str.next());
		}
	}

}
