package day5_test;
import java.util.Scanner;
public class Won2Dollar {
	private int dol;
	Scanner s=new Scanner(System.in);
	
	Won2Dollar(int dol){
		this.dol=dol;
	}
	void run(){
		System.out.println("���� �޷��� �ٲߴϴ�.");
		System.out.println("���� �Է��ϼ���>>");
		double avg=s.nextInt();
		System.out.println("��ȯ ���: "+avg/dol+"�޷��Դϴ�.");
	}

	//���� �޷��� �ٲߴϴ�.
		//���� �Է��ϼ���>> 24000
		//��ȯ ���: 20.0�޷��Դϴ�
}
