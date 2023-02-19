// import java.util.ArrayList;
// import java.util.Collections;

// public class Arr1 {
//     public static void reverseArray(ArrayList<Integer> arr, int m) {

// 		int n = arr.size();

// 		int i = m + 1;       //declare 2 pointers
// 		int j = n - 1;

// 		while (i < j) {          //swap elements as long as i<j
// 			Collections.swap(arr, i, j);
// 			i++;
// 			j--;
// 		}

// 	}
    
// }
import java.util.Arrays;

public class Arr1{
	public static void main(String[] args){
		int[] arr = {1, 2, 3, 4, 5};
		reverse(arr);
		System.out.print(Arrays.toString(arr));

	}

	static void reverse(int[] arr){
		int start = 0;
		int end = arr.length-1;

		while(start<end){
			swap(arr, start, end);
			start++;
			end--;
		}
		}

	static void swap(int[] arr, int index1, int index2){
		int temp = arr[index1];
		arr[index1] = arr[index2];
		arr[index2] = temp;
	}


}
