package day2;

import java.util.Arrays;
import java.util.Random;

public class GugudanTest {
	public static void main(String[] args) {
		//		1.6���� ���ڸ� �Է¹޾� �迭�� �����ϰ� ���ڿ� ���������� �����Ͽ�
		//		Ȧ���� ��� ������ �ٲ��ش�
		//		int arr[]=new int[6];
		//		Random ran=new Random();
		//
		//		for(int i=0; i<arr.length; i++){
		//			arr[i]=ran.nextInt(10)+1;
		//			if(arr[i]%2==1){
		//				//						int num=arr[i];
		//				//						arr[i]=-num;
		//				arr[i]= -arr[i];
		//			}
		//		}

		//2.�迭{15,22,33,50,19,2}�� Ȧ������ ��հ� ¦������ ��� ���ϱ�
		//		int arr[]={15,22,33,50,19,2};
		//		int hol=0;
		//		int jj=0;
		//		int count=0;
		//		int count2=0;
		//		for(int i=0; i<arr.length; i++){õ����
		//			if(arr[i]%2==0){
		//				jj+=arr[i]; //¦������
		//				count++;
		//			}else if(arr[i]%2==1){
		//				hol+=arr[i];//Ȧ������
		//				count2++;
		//			}
		//		}
		//		System.out.println("¦���� �����: "+((double)jj/count));
		//		System.out.println("Ȧ���� �����: "+((double)hol/count2));

		//3.�迭{40,-20,-30,-10,50}���� ���� ū ���� ���� �������� ���ÿ�
		//��, ������ ���밪
		//(ex, ���� ū �� : 50, ���� ���� �� : -10, ��� 40)
		int arr[]={40,-20,-30,-10,50};
		int max=0;
		int min=0;
		for(int i=0; i<arr.length; i++){
			for(int j=i+1; j<arr.length; j++){
				if(Math.abs(arr[i])>Math.abs(arr[j])){
					i=j;//���밪���� ��ȯ�� �ּҰ� 10
					min=arr[i];//-10
				}else if(arr[i]<arr[j]){
					i=j;//�ִ밪 ���ϱ� 50
					max=arr[i];
				}
			}

			//			int max=Math.abs(arr[0]);
			//			int min=Math.abs(arr[0]);//���� �ּҰ�
			//			for(int i=0; i<arr.length; i++){
			//				max=Math.max(max, Math.abs(arr[i]));//�迭�� ū�� ���ϱ�
			//				min=Math.min(min,Math.abs(arr[i]));//�迭�� ������ ���ϱ� Math.min(int a, b)
			//			}
			//			System.out.println(max-min);
			//			
			System.out.println(max-(-min));
		}
		System.out.println(Arrays.toString(arr));
	}
}
