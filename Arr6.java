import java.util.Scanner;
import java.util.ArrayList;

public class Arr6 {
    public static ArrayList < Integer > separateNegativeAndPositive(ArrayList < Integer > nums) {

        int j = 0;

        for (int i = 0; i < nums.size(); i++) {

            if (nums.get(i) < 0) {  
                if (i != j) {
                    int temp = nums.get(i);
                    nums.set(i, nums.get(j));
                    nums.set(j, temp);
                }

                ++j;
            }
        }

        return nums;
    }
    
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        ArrayList<Integer> arr = new ArrayList<>(n);
        for(int i = 0; i < n; i++){
                arr.add(i);
        }
        System.out.println(separateNegativeAndPositive(arr));
    }
} 