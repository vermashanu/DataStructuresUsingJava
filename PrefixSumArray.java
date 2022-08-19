public class PrefixSumArray{
    
    public static void prefixArray(int numbers[]){
        int currentSum =0;
        int maxSubArraySum = Integer.MIN_VALUE;
        int prefix[] = new int[numbers.length];


        prefix[0] = numbers[0];
        // calculation of prefix array
        for (int i =1; i<prefix.length ; i++){
            prefix [i]= prefix [i-1] + numbers[i];
        }
        
            for(int i=0; i<numbers.length ; i++){
             int start = i;
                for(int j=i ; j<numbers.length; j++){
                   int end = j;
                   currentSum = start == 0 ? prefix[end] : prefix[end] - prefix[start - 1];  // check notes for it's explanation
                
            if(currentSum > maxSubArraySum){
                maxSubArraySum = currentSum;
            }
        }
        
    }
    System.out.println("teh maximum sum value of a sub array is "+ maxSubArraySum);
}


    public static void main(String args[]){
        int numbers[] = {1,-2,6,-1,3};
        prefixArray(numbers);

    }
}