package stream;

import java.util.Arrays;

public class IntArrayTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {1,2,3,4,5};
		
		int sumVal = Arrays.stream(arr).sum();
		
		int count = (int)Arrays.stream(arr).count();

	
		System.out.println(sumVal);
		System.out.println(count);
	}

}
