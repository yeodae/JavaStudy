package day9;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Arr_Hash {

	static int score(Scanner s, String kind) {
		// TODO Auto-generated method stub
		int num = 0;
		System.out.println(kind + "점수 입력해주세요.");
		num = s.nextInt();

		while (true) {
			if (num > 100) {
				System.out.println("0~100 입력");
			} else {
				break;
			}
		}
		return num;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<HashMap<String, Object>> list = new ArrayList<HashMap<String, Object>>();
		Scanner s = new Scanner(System.in);
		while (true) {
			System.out.print("(1)입력, (2)삭제, (3)출력, (4)종료 : ");
			int num = s.nextInt();
			if (num == 1) {
				HashMap<String, Object> map = new HashMap<String, Object>();
				System.out.println("사용자 정보 입력");
				System.out.print("이름 : ");
				map.put("name", s.next());
				System.out.print("나이 : ");
				map.put("age", s.nextInt());
				map.put("java", score(s, "자바"));
				map.put("oracle", score(s, "오라클"));
				list.add(map);
			} else if (num == 2) {
				System.out.println("삭제할 사용자 이름, 나이 입력 : ");
				String name = s.next();
				int age = s.nextInt();
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					if (map.get("name").equals(name)
							&& (int) map.get("age") == age) {
						list.remove(i);
					}
				}
			} else if (num == 3) {
				for (int i = 0; i < list.size(); i++) {
					HashMap<String, Object> map = list.get(i);
					System.out.print("이름 : " + map.get("name"));
					System.out.print(", 나이 : " + map.get("age"));
					System.out.print(", 자바 : " + map.get("java"));
					System.out.print(", 오라클 : " + map.get("oracle"));
					System.out.println();
				}
			} else {
				System.out.println("종료 되었습니다.");
				break;
			}
		}
	}
}
