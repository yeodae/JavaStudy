package day9;
import java.util.*;
public class PersonMain {

	public static void main(String[] args) {
		Person p = new Person();
		int p1 = p.result("ȫ�浿");
		int p2 = p.result("������");
		
		if(p1 == p2){
			System.out.println("�����Դϴ�.");
		}else if(p1 > p2){
			System.out.println("ȫ�浿 �¸�");
		}else{
			System.out.println("������ �¸�");
		}

	}

}
