package scheduler;
import java.io.IOException;
public class SchedulerTest {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		System.out.println("��ȭ ��� �Ҵ� ����� �����ϼ���.");
		System.out.println("R : �Ѹ� ���ʷ� �Ҵ�");
		System.out.println("L : ���� �ְų� ��Ⱑ ���� ���� �������� �Ҵ�");
		System.out.println("P : �켱������ ���� �� ���� �Ҵ�");
		System.out.println("A : �� ��ȭ �������");
		
		int ch = System.in.read( );
		Scheduler scheduler = null;
		
		if(ch=='R' ||ch=='r'){
			scheduler = new RoundRobin( );
		}
		else if(ch=='L'||ch=='l'){
			scheduler = new LeasJob( );
		}
		else if(ch=='P'||ch=='p'){
			scheduler = new PriorityAllocation( );
		}
		else if(ch=='A'||ch=='a'){
			scheduler = new AgentGetCall( );
		}
		else {
			System.out.println("�������� �ʴ� ����Դϴ�.");
			return;
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
