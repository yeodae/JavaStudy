package bookshelf;
import java.util.ArrayList;

public class Shelf {
	protected ArrayList<String> shelf;
	//�ڷḦ ������� ������  ArrayList����.
	
	public Shelf(){
		shelf = new ArrayList<String>();
	}//����Ʈ �����ڷ� Shelf Ŭ������ �����ϸ� ArrayList�� ������.
	
	public ArrayList<String> getShelf(){
		return shelf;
	}
	
	public int getCount( ){
		return shelf.size();
	}
}
