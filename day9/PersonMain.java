package day9;
import java.util.*;
public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		int p1 = p.result("홍길동");
		int p2 = p.result("여대현");
		
		if(p1 == p2){
			System.out.println("동점입니다.");
		}else if(p1 > p2){
			System.out.println("홍길동 승리");
		}else{
			System.out.println("여대현 승리");
		}

	}

}
