package day4;

public class ColorTV extends TV2 {
	private int color;
	
	ColorTV(){
		System.out.println("ColorTV �⺻������");
	}
	ColorTV(int size, int color){
		super(size);
		System.out.println("ColorTV �Ķ���� ������");
	}
	
	void setColor(int color){
		this.color=color;
	}
	int getColor(){
		return color;
	}
	void printProperty(){
		System.out.println(getSize()+"��ġ"+getColor()+"�÷�");
	}
}
