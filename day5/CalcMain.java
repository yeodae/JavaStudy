package day5;

import java.util.Arrays;
import java.util.Scanner;

public class CalcMain {
	public static void main(String[] args) {
		Calc calc = new Calc();//��ü����
		calc.message();
		//"�ȳ��ϼ���" ���� ���
		System.out.println(calc.message2());
		//"�ȳ��ϼ���2"���� ���

		calc.sum(1,2);
		//3���
		int a = calc.sum2(3,4);
		System.out.println(a);
		//7���

		double b = calc.sum2(1, 2.5);
		System.out.println(b);
		//3.5���

		//		Scanner s = new Scanner(System.in);
		//		System.out.println("���� �ΰ��� �Է����ּ���");
		//		int c= s.nextInt();
		//		int d= s.nextInt();
		//		calc.max(c,d);
		//		//�ΰ��� ���ڸ� �Է¹޾Ƽ� = ū ���� 00 �Դϴ�. ���
		//		s.close();

		int arr[]={3, 2, 6, 5, 4};
//		calc.arr1(arr);
		//���� ���� ���ڿ� ���� ū ������ ��ġ �ٲٱ�
		System.out.println(Arrays.toString(arr));
		//{3,6,2,5,4} //�迭�� ���۷����� �����Ǳ� ������ ���ϰ��� ���� void���
		
		calc.arr2(arr);
		//���� ���� ���ڿ� ������ �迭 ���� ��ġ �ٲٱ�
		System.out.println(Arrays.toString(arr));
		//{3,6,2,5,4} //�迭�� ���۷����� �����Ǳ� ������ ���ϰ��� ���� void���
		

	}
}
