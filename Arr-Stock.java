class ArrStock {
    public int maxProfit(int[] prices) {
        int ans = min(prices);
        int index = 0;
        if(prices.length < ans +1){
            index = 0;
        } else{
        int max = 0; 
        for(int i = ans+1; i < prices.length; i++){
            if(max < prices[i] ){
                max = prices[i];
                index = i+1;
            }
        }} return index;

    }
    

    public int min(int[] arr){
        int min = arr[0];
        int index = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] < min){
                min = arr[i];
                index = i;
                
            }
        }
        return index;
}
}
