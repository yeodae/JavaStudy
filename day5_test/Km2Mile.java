package day5_test;
import java.util.Scanner;

public class Km2Mile {
	Scanner s=new Scanner(System.in);
	private double km;
	double mile;

	Km2Mile(double km){
		this.km=km;
	}
	void run(){
		System.out.println("Km�� mile�� �ٲߴϴ�.");
		System.out.println("Km�� �Է��ϼ���>>");
		double mile=s.nextInt();
		System.out.println("��ȯ ���: "+mile/km+"mile�Դϴ�.");
	}
}
