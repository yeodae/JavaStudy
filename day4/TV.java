package day4;

public class TV {
	String name; //��������
	int year;
	int size;
	
	TV(String name, int year, int size){
		this.name=name;
		this.year=year;
		this.size=size;
	}
	void show(){
		System.out.println(name+"���� ���� "+year+"���� "+size+"��ġ TV");
	}
	
	
}
