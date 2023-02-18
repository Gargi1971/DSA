import java.util.ArrayList;
import java.util.Collections;

public class Arr1 {
    public static void reverseArray(ArrayList<Integer> arr, int m) {

		int n = arr.size();

		int i = m + 1;       //declare 2 pointers
		int j = n - 1;

		while (i < j) {          //swap elements as long as i<j
			Collections.swap(arr, i, j);
			i++;
			j--;
		}

	}
    
}
