
import java.util.ArrayList;
import java.util.Collections;
public class Arr3 {
    public class Solution {
        public static ArrayList<Integer> kthSmallLarge(ArrayList<Integer> arr, int n, int k) {
            ArrayList<Integer> ans = new ArrayList<Integer>(5);
            Collections.sort(arr);
            ans.add(arr.get(k-1));
            Collections.sort(arr, Collections.reverseOrder());
            ans.add(arr.get(k-1));
            
            return ans;
            
        }
    
        // static ArrayList<Integer> swap(ArrayList<Integer> arr, int n){ 
        // 	int i;
        // 	for(i = 0; i < n; i++){
        // 		if(arr.get(i) > arr.get(i+1)){
        // 			Collections.swap(arr, i, i+1);
        // 		}
        // 	}
        // 	return arr;
        // }
    
}
}
