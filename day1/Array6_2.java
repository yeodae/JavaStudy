package day1;

import java.util.Arrays;

public class Array6_2 {
	public static void main(String[] args) {
		int arr[] = {7,6,9,3,5};
		int temp=0;
		int min=0;
		
		for(int i=0; i<arr.length; i++){
			if(arr[min]>arr[i]){
				min=i; // min 3 �ּҰ� ��ġ ����
			}
		}
		//��ġ�ٲٱ�
		temp=arr[0];
		arr[0]=arr[min];
		arr[min]=temp;
		System.out.println(Arrays.toString(arr));
		
//		int temp=0;
//		int min=0;
//		//���� �������ڸ� ù��°�� �ű��
//		
//		for(int i=0; i<arr.length; i++){
//			if(arr[min]>arr[i]){
//				min=i; // �ּҰ� 3 ����
//			}
//		}
//		temp=arr[0];//7����
//		arr[0]=arr[min];
//		arr[3]=temp;
//		System.out.println(Arrays.toString(arr));
	}
}
