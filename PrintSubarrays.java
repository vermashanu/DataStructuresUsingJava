class PrintSubarrays{
    
    public static void printSubarrays(int numbers[]){
        int totalSubArrays = 0;
        for(int i =0; i<numbers.length ; i++){
            int start =i;
                for(int j= i; j<numbers.length; j++){
                    int end = j;
                        for (int k= start; k<=end ; k++){       // printing
                            System.out.print(numbers[k]+ " ");  // subarray
                        }
                         totalSubArrays++;
                         System.out.println();
                }
                System.out.println();
        }
        System.out.println();
        System.out.println("total number of subarrays : " +totalSubArrays);
    }
    public static void main(String args[]){
    int numbers[] = {2,4,6,8,0,7};
    printSubarrays(numbers);
    }
}