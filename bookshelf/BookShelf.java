package bookshelf;

public class BookShelf extends Shelf implements Queue{

	@Override
	public void enQueue(String title) {
		// TODO Auto-generated method stub
		shelf.add(title); //�迭�� ��� �߰�
	}

	@Override
	public String deQueue() {
		// TODO Auto-generated method stub
		return shelf.remove(0); // �� ó�� ��Ҹ� �迭���� �����ϰ� ��ȯ
	}

	@Override
	public int getSize() {
		// TODO Auto-generated method stub
		return getCount( ); // �迭 ��� ���� ��ȯ
	}
	
}
