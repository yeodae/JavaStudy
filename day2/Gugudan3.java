package day2;
import java.util.Arrays;
import java.util.Scanner;
//1.3�ǹ�� ������ �����
public class Gugudan3 {
	public static void main(String[] args) {
		//		for(int i=2; i<10; i++){
		//			for(int j=1; j<10; j++){
		//				if(i%3==0){
		//					System.out.print(i+"x"+j+"="+i*j);
		//				}
		//			}
		//		}//for-end

		//
		//2.0�� �ԷµǱ� ������ �Էµ� ���ڵ� ���ϱ�(�����Է½� �ٽ� �Է��ϵ���)
		//		Scanner s=new Scanner(System.in);
		//		System.out.println("����� ���ڸ� ������ 0������ �ջ��մϴ�.");
		//		int sum=0;
		//
		//		while(true){
		//			int num=s.nextInt();					
		//			if(num==0){
		//				System.out.println("�Էµ� �� �� : "+sum);
		//				break;
		//			}else if(num<0){
		//				System.out.println("����� �Է����ּ���.");
		//			}else if(num>0){
		//				sum+=num;
		//			}
		//		}
		//
		//3.�迭 {10,-20,30,40,50}�� ������ ������ ��հ� ���ϱ�
		//		int arr[]={10,-20,30,40,50};
		//		double num=0;
		//		int count=0;
		//
		//		for(int i=0; i<arr.length; i++){
		//			if(arr[i]>0){
		//				num+=arr[i];
		//				count++;
		//			}//��� �������
		//		}//for-end
		//		double avg=num/count;
		//		System.out.println("������ ��� : "+avg);
		//
		//4.5���� ���ڸ� �Է¹޾� �迭�� �ֱ�. ��, ������ ��� ����
		//		Scanner s=new Scanner(System.in);
		//	
		//		int arr[] = new int[5];
		//		
		//		for(int i=0; i<arr.length; i++){
		//			System.out.println("�����Է�");
		//			int ra=s.nextInt();
		//			if(ra>0){
		//				arr[i]=ra;
		//			}else{
		//				System.out.println("����� �Է����ּ���.");
		//				i--;
		//			}
		//		}
		//		System.out.println(Arrays.toString(arr));
		//
		//5.���� �ǽ����� ������ �������� �ϼ��ϱ�.
		//		int arr[] = {7,6,9,3,5};
		//		int temp=0;
		//
		//		for(int i=0; i<arr.length; i++){
		//			for(int j=i+1; j<arr.length; j++){
		//				if(arr[i]>arr[j]){
		//					temp=arr[i];
		//					arr[i]=arr[j];
		//					arr[j]=temp;
		//				}//��������
		//			}	
		//		}		
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
		//		}//��������
		//
		//		System.out.println(Arrays.toString(arr));
		//
		//6.�迭���� �ߺ�����
		int arr[]={30,20,60,0,25,20,60,0,10,30};
		int count=0;
		int temp=0;
		
		for(int i=0; i<arr.length; i++){
			int index=i;
			for(int j=i+1; j<arr.length; j++)
				
				if(arr[i]==arr[j]){
					count++;
					
				}else{
					index=j;
				}
			temp=arr[i];//�ߺ��� i�� temp����
			arr[i]=arr[index];//�ߺ��� j�� i��ġ��
			arr[index]=temp;
			int arr2[]= new int[count];
			System.out.println(Arrays.toString(arr2));
		}
		
		System.out.println(count);
		System.out.println(Arrays.toString(arr));
//		System.out.println(Arrays.toString(arr2));
	}
}
