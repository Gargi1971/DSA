import java.util.Arrays;


public class Arr4 {

    public static void main(String[] args) {
        sort();
    }

    static int[] sort(){
        int[] nums = {5, 4, 3, 8, 12};
        
        for(int i = 0; i < nums.length; i++){
            for(int j = i+1; j < nums.length; j++){
            if(nums[i] > nums[j]){
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp; 
                

            }
        }

        }
        System.out.println(Arrays.toString(nums));


        return nums;

    }
    
}
