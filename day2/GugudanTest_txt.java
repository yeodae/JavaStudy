package day2;
import java.util.Arrays;
import java.util.Scanner;
public class GugudanTest_txt {
	public static void main(String[] args) {
		int arr[]={40,-20,-30,-10,50}; // ���밪���� ū�� - ������ ���ϱ�
		int max=Math.abs(arr[0]);
		int min=Math.abs(arr[0]);//���� �ּҰ�
		for(int i=0; i<arr.length; i++){
			max=Math.max(max, Math.abs(arr[i]));//�迭�� ū�� ���ϱ�
			min=Math.min(min,Math.abs(arr[i]));//�迭�� ������ ���ϱ� Math.min(int a, b)
		}
		System.out.println(max-min);
		
		
//		Scanner s=new Scanner(System.in);
//		int arr[] = new int[6];
//		for(int i=0; i<6; i++){
//			int num = s.nextInt();//�迭�� ������ 6�� ���� �Է�
//			if(num%2==0){
//				arr[i]=num;
//			} else{
//				arr[i] = -num;
//			}
//		}



		//		int arr[] = {7,6,9,3,5};
		//
		//
		//		for(int i=0; i<arr.length; i++){
		//			int index=i; // i=0
		//			for(int j=i+1; j<arr.length; j++){
		//				if(arr[index]>arr[j]){
		//					index=j;//index=1
		//				}
		//			}
		//			int temp=arr[index];//�ּҰ� ����
		//			arr[index]=arr[i];//����������
		//			arr[i]=temp;
		//		}

		//		for(int i=0; i<arr.length; i++){
		//			int Index=i; // Index=0;
		//			for(int j=i+1; j<arr.length; j++){ // j=1;
		//				if(arr[Index]>arr[j]){
		//					Index=j; // index=1; 
		//				}
		//			}
		//			int temp=arr[Index];//3
		//			arr[Index]=arr[i]; //7
		//			arr[i]=temp;//3
		//		}//��������




		//		int arr[]={30,20,60,0,25,20,60,0,10,30};
		//		for(int i=0; i<arr.length; i++){
		//			for(int j=i+1; i<arr.length; j++){
		//				if(arr[i]==arr[j]){
		//					
		//				}
		//			}
		//				
		//			
		//		}		
		System.out.println(Arrays.toString(arr));
	}
}
