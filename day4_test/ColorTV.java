package day4_test;

public class ColorTV extends TV {
	private int color;//��������
	
	public ColorTV(int size,int color) {//������
		super(size);
		this.color=color;
	}
	protected int getColor(){
		return color;
	}
	public void printProperty(){
		System.out.println(getSize()+"��ġ "+getColor()+"�÷� TV");
	}
}
//��� : 32��ġ 1024�÷�