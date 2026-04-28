package Question_11;

public class Min {
	public static <T extends Number & Comparable<T>> T findMin(T[] arr){
		
		T min = arr[0];
		
		for(T ele: arr) {
			if(ele.compareTo(min) < 0) {
				min = ele;
			}
		}
		return min;
	}
	public static void main(String[] args) {
		  Integer[] arr1 = {5, 2, 9, 1};
	      Double[] arr2 = {3.5, 1.2, 7.8};
	      System.out.println(findMin(arr1));
	      System.out.println(findMin(arr2));
	}
}
