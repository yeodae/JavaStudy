package study01;

import java.util.Arrays;

public class Sample03 {

	public static void main(String[] args) {
		int arr[] = {4, 3, 5, 2, 1};
		//1.배열 최대값 구하기
		int max=arr[0];
		for(int i=0; i<arr.length; i++){
			//			if(arr[i]>max){
			//				max=arr[i];
			//			}
			max=Math.max(max, arr[i]);
		}
		System.out.println(max);
		//
		//2.배열  총 합 구하기
		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum +=arr[i];
		}
		
		System.out.println(sum);
		//
		//3.배열 최소값 구하기
		int min=arr[0];
		for(int i=0; i<arr.length; i++){
			if(min>arr[i]){
				min=arr[i];
			}
		//	min=Math.min(min, arr[i]);
		}
		System.out.println(min);
		//
		//4.배열 양수의 합
		int arr2[] = {4, -3, 5, -2, 1, -8, 7, -9};
		int sum2=0;
		for(int i=0; i<arr2.length; i++){
			if(arr2[i]>0){
				sum2+=arr2[i];
			}
		}
		System.out.println(sum2);
		//
		//5.배열 개수만큼 별 찍기
		int arr3[] = {3, 5, 1, 2, 3};
		for(int i=0; i<arr3.length; i++){
			for(int j=0; j<arr[i]; j++){
				System.out.print("*");
			}
			System.out.println("");
		}
		//
		//6.가장 큰 숫자와 가장 작은 숫자의 위치 바꾸기
		int arr4[] = {7,6,9,3,5};
		int maxIndex=0;
		int minIndex=0;
		for(int i=1; i<arr4.length; i++){
			if(arr4[maxIndex]<arr4[i]){
				maxIndex=i;
			} else if (arr4[minIndex]>arr4[i]){
				minIndex=i;
			}
		}
		int temp=arr4[maxIndex];//9
		arr4[maxIndex]=arr4[minIndex];
		arr4[minIndex]=temp;
		System.out.println(Arrays.toString(arr4));
	}
}
