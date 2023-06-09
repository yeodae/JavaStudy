package day9;
import java.util.*;
public class Collection2 {
	
	static void printList(ArrayList<Integer> list){
		//리스트를 순회할 수 있게 해주는 객체
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
			System.out.println("배열에 숫자를 넣어주세요");
			list.add(s.nextInt());
		}
		
		Collections.sort(list);//배열정렬
		printList(list);
		
//		Collections.reverse(list); //배열 반대정렬
		System.out.println("Index검색 : 찾을 숫자를 입력하세요");
		int num = s.nextInt();
		int Index = Collections.binarySearch(list, num) + 1;
		System.out.println("입력하신 값은 "+Index+"번째에 있습니다.");
	}

}
