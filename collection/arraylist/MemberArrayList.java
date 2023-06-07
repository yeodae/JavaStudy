package collection.arraylist;

import java.util.ArrayList;
import collection.Member;

public class MemberArrayList {
	private ArrayList<Member> arrayList;
	//Arraylist����
	public MemberArrayList(){
		arrayList = new ArrayList<Member>();
		//member������ ������ ArrayList ����
	}
	
	public void addMember(Member member){
		arrayList.add(member);
	}//����Ʈ�� ȸ���� �߰��ϴ� �޼���
	
	public void insertMember(Member member, int position) {
		if(position <0 || position > arrayList.size()+1) {
			System.out.println("���� �� �ڸ��� �߰��� �� �����ϴ�");
			return;
		}
		arrayList.add(position-1, member);
	}
	
	
	public boolean removeMember(int memberId){
		for(int i=0; i<arrayList.size(); i++){
			Member member = arrayList.get(i);
			//get �޼���� ȸ���� ���������� ������
			int tempId = member.getMemberId();
			if(tempId == memberId){
				//ȸ�� ���̵� �Ű������� ��ġ�ϸ�
				arrayList.remove(i);
				//�ش� ȸ���� ����
				return true;
			}
		}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;//�ݺ����� ���������� ���̵� ã�� ���Ѱ��
	} //�ش� ���̵� ���� ȸ���� arraylist���� ã�� ������.
	
	public void showAllMember(){ //��ü ȸ���� ����ϴ� �޼���
		for(Member member : arrayList){
			System.out.println(member);
		}
		System.out.println();
	}
}
