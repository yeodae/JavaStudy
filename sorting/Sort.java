package sorting;

public interface Sort {
	public void ascedning(int[] arr);
	public void descending(int[] arr);
	
	default void description(){
		System.out.println("���ڸ� �����ϴ� �˰����Դϴ�.");
	}
}
