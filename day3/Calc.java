package day3;

public class Calc {
	void sum(){
		System.out.println("void sum ȣ��");
	}

	int sum2(int a, int b){ //
		return a+b;
	}
	int max(int a, int b){
		return Math.max(a, b);//�ִ밪�� �������ش�.
		//return (a >= b) ? a : b; //���׿�����
	}
	int min(int a, int b){
		return Math.min(a, b);//�ּҰ��� �������ش�.
	}
	int abs(int a){
		return Math.abs(a); //���밪�� �������ش�.
		//return (a >= 0) ? a : -a;//���׿�����
	}
	int min(int a, int b, int c){ 
		//�Ű����� �������� �����ε��Ǿ� ��밡��
		return (min(a,b) >= c) ? c : min(a,b);
		//		if(a<=b && a<=c){
		//			return a;
		//		}else if(b<=c && b<=a){
		//			return b;
		//		}else{
		//			return c;
		//		}
	}
	double sum2(double a, double b){//�����ε�:sum2
		return a+b;
	}
	int arrMax(int[] arr){ // �迭���� ����ū�� ���ϱ�
		int max= arr[0];
		for(int num : arr){
			max = Math.max(max,num);
		}
		return max;
	}

	double arrAvg(int[] arr){ //�迭�� �� ������
		double avg=arr[0];
		int sum=0;
		//		for(int i=0; i<arr.length; i++){
		//			sum+=arr[i];
		//		}
		//		avg=(double)sum/arr.length;
		//		return avg;
		for(int i:arr){
			sum += i;
			avg= (double)sum/arr.length;
		}
		return avg;
	}
	void test1(int a){
		a = a+1; //�����������ʾ� ������ �������� 11�̵Ǿ� ��.
	}
	void test2(int[] arr){ //��ü(���۷���)�� �ּҸ� �����ִµ� 
		arr[0] = 100; // �迭�� ���� �ּҸ� ����ϱ⿡ �Ѿ��.
	}

}

