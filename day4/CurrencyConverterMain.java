package day4;
import java.util.Scanner;
public class CurrencyConverterMain {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.print("ȯ��(1�޷�)>> ");
		double rate=scan.nextDouble();
		CurrencyConverter.setRate(rate);
		System.out.println("�鸸���� $"+CurrencyConverter.toDollar(1000000)+"�� �Դϴ�.");
		System.out.println("$100�� "+CurrencyConverter.toKWR(100)+"�� �Դϴ�.");
	}
}
