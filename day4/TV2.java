package day4;

public class TV2 {
	private int size;

	TV2(){
		System.out.println("TV2 �⺻������");
	}
	TV2(int size){
		this.size=size;
		System.out.println("TV2 �Ķ���� ������");
	}
	
	void setSize(int size){
		this.size = size;
	}
	int getSize(){
		return size;
	}
}
