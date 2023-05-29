package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		shelf.add(title); //배열에 요소 추가
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return shelf.remove(0); // 맨 처음 요소를 배열에서 삭제하고 반환
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount( ); // 배열 요소 개수 반환
	}
	
}
