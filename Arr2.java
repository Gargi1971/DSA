// import java.util.* ;
// import java.io.*; 
import java.util.Scanner;

public class Arr2 {
    public static int sumOfMaxMin(int[] arr, int n) {
        int max1 = max(arr, n);
        int min1 = min(arr, n);
        return max1 + min1;
    }
  
    static int max(int[] arr, int n){
      int max = arr[0];
      int i;
      for(i = 1; i < n; i++){
      if(max < arr[i]){
        max = arr[i];
      } 
      }
      return max;  
   
    }
  
    static int min(int[] arr, int n){
      int min = arr[0];
      int i;
      for(i = 1; i < n; i++){
      if(min > arr[i]){
        min = arr[i];
      }
      }
      return min;
    }
  
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      int n = sc.nextInt();
  
      int[] arr = new int[n];
  
      for(int i = 0; i < n; i++){
        arr[i] = sc.nextInt();
      }
      sc.close();
      System.out.println(sumOfMaxMin(arr, n));
    }
    
}
