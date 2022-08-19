public class BruteForce{
    // to find the maximum sum of subarray
    public static void maxSubArraySum(int numbers[]){
    int currrentSum = 0;
    int maxSum = Integer.MIN_VALUE;

    for (int i=0; i<numbers.length; i++){
        int start =i;
        for(int j=i; j<numbers.length; j++){
            int end =j;
            currrentSum =0;
            for(int k= start; k<=end; k++){
               // subarray sum
               currrentSum = currrentSum + numbers[k];
            }
               System.out.print(currrentSum +" ");
               if(maxSum < currrentSum){
                maxSum = currrentSum;
               }
        }
        
    }
    System.out.println();
     System.out.println("the maximum sum is "+maxSum);
   }
    public static void main(String args[]){
    int numbers[]= {1,-2,6,-1,3};
    maxSubArraySum(numbers);
    }
}