package day9;
import java.util.*;
public class Collection2 {
	
	static void printList(ArrayList<Integer> list){
		//����Ʈ�� ��ȸ�� �� �ְ� ���ִ� ��ü
		Iterator<Integer> it = list.iterator();
		while(it.hasNext()){
			int n=it.next();
			String str;
			
			if(it.hasNext()){
				str="==>";
			}else{
				str="\n";
			}
			System.out.print(n+str);
		}
	}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		ArrayList<Integer> list = new ArrayList<>();
		
		for(int i=0; i<5; i++){
			System.out.println("�迭�� ���ڸ� �־��ּ���");
			list.add(s.nextInt());
		}
		
		Collections.sort(list);//�迭����
		printList(list);
		
//		Collections.reverse(list); //�迭 �ݴ�����
		System.out.println("Index�˻� : ã�� ���ڸ� �Է��ϼ���");
		int num = s.nextInt();
		int Index = Collections.binarySearch(list, num) + 1;
		System.out.println("�Է��Ͻ� ���� "+Index+"��°�� �ֽ��ϴ�.");
	}

}
