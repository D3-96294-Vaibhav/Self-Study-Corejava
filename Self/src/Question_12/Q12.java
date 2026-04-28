package Question_12;

import java.util.Comparator;

class AscComparator<T extends Comparable<T>> implements Comparator<T> {

	@Override
	public int compare(T o1, T o2) {
		// TODO Auto-generated method stub
		return o1.compareTo(o2);
		
	}
	
}

public class Q12 {

	static <T> void selectionSort(T[] arr, Comparator<T> c) {
		for (int i = 0; i < arr.length - 1; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				if (c.compare(arr[i], arr[j]) > 0) {
					T temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
	}

	public static void main(String[] args) {
		Integer[] arr = {2,34,654,23,6,56};
		Double[] arr1 = {2.0,34.5,65.4,2.3,6.85,5.6};
		selectionSort(arr, new AscComparator<Integer>());
		selectionSort(arr1, new AscComparator<Double>());
		for (Integer integer : arr) {
			System.out.print(integer + " ");
		}
		System.out.println();
		for (Double integer : arr1) {
			System.out.print(integer + " ");
		}
 	}
	
	
}
