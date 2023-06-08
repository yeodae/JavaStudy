package collection.treeset;
import java.util.*;

import collection.Member;
public class MemberTreeSet {
	private TreeSet<Member> treeSet;
	
	public MemberTreeSet(){
		treeSet = new TreeSet<Member>();
	}
	
	public void addMember(Member member){
		treeSet.add(member);
		//TreeSet�� ȸ���� �߰��ϴ� �޼���
	}
	
	public boolean removeMember(int memberId){
		Iterator<Member> ir = treeSet.iterator();
		//TreeSet���� ȸ���� �����ϴ� �޼���
		while(ir.hasNext()){
			Member member = ir.next();
			int tempId = member.getMemberId();
			if(tempId == memberId){
				treeSet.remove(member);
				return true;
			}
		}
		System.out.println(memberId+"�� �������� �ʽ��ϴ�.");
		return false;
	}
	
	public void showAllMember(){
		for(Member member : treeSet){
			System.out.println(member);
		}
		System.out.println();
	}
	
}
