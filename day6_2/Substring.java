package day6_2;
import java.util.*;
public class Substring {
	public static void main(String[] args) {
		//�ֹι�ȣ�� �Է¹޾Ƽ� �������� �������� �Ǻ�
//		                   123456789
//		String Substring = "940823-1234567";
		Scanner s = new Scanner(System.in);
		System.out.println("�ֹι�ȣ�� �Է��ϼ���.");
		String input = s.next().substring(7,8);
				
		if(input.equals("1") || input.equals("3")){
			System.out.println("�����Դϴ�.");
		}else if(input.equals("2") || input.equals("4")){
			System.out.println("�����Դϴ�.");
		}else{
			System.out.println("�ٽ� �Է����ּ���.");
		}
		
//		Scanner s = new Scanner(System.in);
//		String input = s.next();
//		if(input.length() != 14){
//			System.out.println("�ٽ� �Է�(14����)");
//			return;
//		}
//		if(input.substring(7,8).equals("1")
//				|| input.substring(7,8).equals("3")){
//			System.out.println("����");
//		}
//		else{
//			System.out.println("����");
//		}
	}
}
