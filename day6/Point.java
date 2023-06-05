package day6;

public class Point {
	private int x, y;
	public Point(int x, int y) {
	this.x = x;
	this.y = y;
	}
	public String toString(){
		return "Point("+ x +","+y+")";
	}
	
	//new Point(2,5);
	//new Point(1,6); true;
	//x와 y의 값 합이 같으면 true return
	public boolean equals(Object obj) {
		Point p = (Point)obj;
		if(x+y == p.x+y){
		return true;
		}else
		return false;
	
	}
		
}
