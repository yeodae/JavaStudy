package day4;

public class Human {
	String name;
	String add;
	String tel;
	int age;

	Human(String name){
		this(name,"�˼�����","�˼�����");//this() Ȱ��
	}
	Human(String name,String add){
		this(name,add,"�˼�����");//this() Ȱ��
	}
	Human(String name,String add,String tel){
		this(name,add,tel,0);
	}
	Human(String name,String add,String tel,int age){
		this.name=name;
		this.add=add;
		this.tel=tel;
		this.age=age;
		
}
	
	public String toString(){
		return "�̸��� "+name+"�ּҴ� "+add+"�ڵ�����ȣ�� "+tel+" �Դϴ�.";
	}
}

