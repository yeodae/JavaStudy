package day1;

import java.util.Arrays;

public class Array6 {
	public static void main(String[] args) {
		int arr[] = {7,6,9,3,5};
		//��������
		//{3, 6, 9, 7, 5}
		//{3, 5, 9, 7, 6}
		//{3, 5, 6, 7, 9}

		int minIndex=0; //2
		int maxIndex=0; //3
		//���� ū ���ڿ� �������� ������ ��ġ�ٲٱ�
		for(int i=0; i<arr.length; i++){
			if(arr[maxIndex]<arr[i]){
				maxIndex=i; //2 �迭��ġã��
			}
			if(arr[minIndex]>arr[i]){
				minIndex=i;//3 �迭��ġã��
			}
		}
		int temp = arr[maxIndex];//�ӽú��� 9

		arr[maxIndex]=arr[minIndex];//7,6,��3,3,5
		arr[minIndex]=temp;//7,6,3,��9,5

		System.out.println("�ִ� ��: "+arr[maxIndex]);
		System.out.println("�ּ� ��: "+arr[minIndex]);
		System.out.println(Arrays.toString(arr));
	}
}
