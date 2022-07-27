import java.util.*;
public class TestArrays01 {
	public static void main(String[] args) {
		int iArray[] = new int[] {9179, 1234, 7991, 3467, 2890, 7190, 6010, 5100, 4412, 9999};
		for(int i : iArray) {
			System.out.print(i + ", ");
		}
		System.out.println();

		Arrays.sort(iArray);
		for(int i : iArray) {
			System.out.print(i + ", ");
		}
		System.out.println();
		System.out.println("Arrays.binarySearch(iArray, 9179) : " + Arrays.binarySearch(iArray, 9179));
		
		int iArray2[] = Arrays.copyOf(iArray, 5);
		//int iArray2[] = Arrays.copyOfRange(iArray, 3, 7);

		for(int i : iArray2) {
			System.out.print(i + ", ");
		}
		System.out.println();
		
		Arrays.fill(iArray, 1111);
		for(int i : iArray) {
			System.out.print(i + ", ");
		}
		System.out.println();
		

	}
}
