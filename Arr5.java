import java.util.Scanner;

public class Arr5 {
    public static int[] sort012(int[] arr)
    {
        for(int i = 0; i < arr.length; i++){
            for(int j = i+1; j < arr.length; j++){
            if(arr[i] > arr[j]){
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp; 
                

            }
        }

        }


        return arr;
       
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] nums = new int[n];
        for(int i = 0; i < n; i++){
            nums[i]= s.nextInt();
        }
        System.out.println(sort012(nums));
    }
    
}
