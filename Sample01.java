package study01;
import java.util.Random;
import java.util.Scanner;
public class Sample01 {

	public static void main(String[] args) {
		// ���� ������ ����
		Scanner s=new Scanner(System.in);//�Է�
		Random r=new Random();//���� ����
		
		while(true){
			System.out.println("���� ���� �Է����ּ���.");
			int num=s.nextInt();//�� �Է�
			for(int i=0; i<num; i++){
				int rnum1=r.nextInt(8)+2;//�����Է�
				int rnum2=r.nextInt(9)+1;
				System.out.print(rnum1+"x"+rnum2+"=");
				
				int dap=s.nextInt();
				if(dap==(rnum1*rnum2)){
					System.out.println("����!");
				}else{
					System.out.println("����. ������ "+(rnum1*rnum2)+"�Դϴ�.");
				}
			}
			System.out.println("����Ͻðڽ��ϱ�? 0�� �Է½� �����մϴ�.");
			int exit=s.nextInt();
			if(exit==0){
				break;
			}
		}
		System.out.println("����Ǿ����ϴ�.");
	}

}
