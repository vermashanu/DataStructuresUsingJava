import java.util.*;

class ReverseAnarray{
        public static void reverseAnArray(int numbers[]){
        int first = 0;
        int last = numbers.length - 1;
        while (first < last){
            int temp = numbers[last];     // swapping
            numbers[last] = numbers[first];
            numbers[first] = temp;
            first ++;
            last --;
        }
}
    public static void main(String args[]){
        int numbers[] = {2,4,6,7,9,8};
        reverseAnArray(numbers);
        //print
        for(int i=0; i <numbers.length ; i++){
            System.out.print(numbers[i]+" ");
        }

    }
}