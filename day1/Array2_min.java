package day1;

public class Array2_min {
	public static void main(String[] args) {
		int arr[] = {5,2,3,1,4};
		int min=arr[0];

		for(int i=0; i<arr.length; i++){
			if(min>arr[i]){
				min=arr[i];//�迭 �ּҰ� ���ϱ�
				//min=Math.min(min,arr[i]);
			}
		}
		System.out.println("MIN : "+min);
	}
}
