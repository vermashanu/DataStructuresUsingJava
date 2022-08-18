import java.util.*;

class LargestInArray{


    public static int findLargest(int numbers[]){
        int largest = Integer.MIN_VALUE;    // -Infinity
        // int smallest = Integer.MIN_VALUE;   // + Infinity
        for(int i=0; i<numbers.length ; i++){
            if(largest < numbers[i]){
                largest = numbers[i];
            }
        }
        return largest;
}

    public static void main(String args[]){
        int numbers[]= {2,6,8,9,3,4};
        int largest = findLargest(numbers);
        System.out.println("the largest number is "+ largest);
    }
}