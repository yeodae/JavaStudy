package day3;
import java.util.Arrays;
//����
import java.util.Scanner;
public class Test {
	public static void main(String[] args) {
		//		1. �����ܿ��� 5���� �����ϰ� ���
		//		for(int i=2; i<10; i++){
		//			for(int j=1; j<10; j++){
		//				if(i%5!=0){
		//					System.out.println(i+"x"+j+"="+i*j);
		//				}
		//			}
		//		}
		//		2. 5���� ���ڸ� �Է¹޾Ƽ� �迭 �����. ��, Ȧ���� ������
		//		int arr[]=new int[5];
		//		Scanner scan=new Scanner(System.in);
		//		System.out.println("�迭�� �� ������ �Է����ּ���.");
		//
		//		for(int i=0; i<arr.length; i++){
		//			int input=scan.nextInt();
		//			if(input%2==1){
		//				arr[i]=input;
		//				System.out.println("�ѹ��� �Է�");
		//			}else{
		//				i--;
		//			}
		//		}
		//		System.out.println(Arrays.toString(arr));

		//		3. {5, 3, 10, 2, 9, 8}
		//		�������� �����ϱ�. ��, Ȧ������ �����ϰ� ¦�� ����
		//		ex) {3, 5, 9, 2, 8, 10}
		//		-> Arrays.sort() �ᵵ ��
		//		-> Ȧ��, ¦���� ������ ���ٰ� ����
		int arr[] ={5, 3, 10, 2, 9, 8};
			
		Arrays.sort(arr);
		int resultArr[]=new int[arr.length];
		int index = 0;
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2!=0){
				resultArr[index++]=arr[i];
			}
		}
		for(int i=0; i<arr.length; i++){
			if(arr[i]%2==0){
				resultArr[index++]=arr[i];
			}
		}
		System.out.println(Arrays.toString(resultArr));

		//	4. Calculator Ŭ���� ����
		//	1. �ΰ��� ������ �Ű������� �޾Ƽ� ���� ���� �������ִ� multiple �޼ҵ� ����
		//	2. 3���� ������ �Է¹޾Ƽ� ���� ���� �������ִ� multiple �޼ҵ� ����
		//	3. 4���� �Ǽ�(double)�� �Է¹޾Ƽ� ���� ū ���� �������ִ� max �޼ҵ� ����


	}
	
}
