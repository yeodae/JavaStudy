package day5;

public class Banana extends Fruit{
	private int price;

	Banana(String name,String color,int price){
		super(name,color);
		this.price=price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}
	
	void view(){//�������̵�
		System.out.print("�����̰� �����ϴ� �ٳ��� ==> ");
		super.view();
		System.out.println();
	}
}
