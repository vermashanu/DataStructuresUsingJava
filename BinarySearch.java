import java.util.*;

public class BinarySearch{

public static int binarySearch(int numbers[], int key){
    int start = 0;
    int end = numbers.length - 1;
    
    while(start <= end){
        int mid = (start + end)/2;
        if (key == numbers[mid]){
            return mid;
        }
        if (key < numbers[mid]){
            end = mid-1;
        }
        else{
            start = mid +1;
        }
    }
    return -1;
    
    }
public static void main(String args[]){
    int numbers[] = {2,5,6,8,9,11,12};
    int key = 19;
    int resultedIndex = binarySearch(numbers, key);
    System.out.println("the key is present at "+resultedIndex);
}
}