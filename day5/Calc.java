package day5;

public class Calc {
	int x;
	int y;

	void message(){
		System.out.println("�ȳ��ϼ���");
	}
	public String message2(){
		return 	"�ȳ��ϼ���2";
	}	

	void sum(int x, int y){
		System.out.println(x+y);
	}
	int sum2(int x, int y){
		return x+y;
	}
	double sum2(double x, double y){
		return x+y;
	}

	void max(int c, int d){
		System.out.println("�ΰ��� ���� �� ū ���� "+((c>=d) ? c:d));
	}

	void arr1(int[] arr){//�迭�� ���۷����� �����Ǳ� ������ ���ϰ��� ���� void���
		int max=0;
		int min=0;
		//int arr[]={3, 2, 6, 5, 4};
		for(int i=1; i<arr.length; i++){
			if(arr[max]<arr[i]){//ū��ã��
				max=i; // ��ġ���� �����ؾ� ���� �ٲܼ��ִ�.
			}
			if(arr[min]>arr[i]){
				min=i; //1 //��ġ������
			}
		}
		int temp=arr[max];
		arr[max]=arr[min];
		arr[min]=temp;
	}
	void arr2(int[] arr){
		//���� ���� ���ڿ� ������ �迭 ���� ��ġ �ٲٱ�
		int min=0;
		//int count=0;
		//int arr[]={3, 2, 6, 5, 4};
		for(int i=1; i<arr.length; i++){
			if(arr[min]>arr[i]){
				min=i;
			}
//			count++;
		}
		int temp=arr[min];
		arr[min]=arr[arr.length-1];
		arr[arr.length-1]=temp;
	}

}
