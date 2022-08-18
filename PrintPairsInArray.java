public class PrintPairsInArray{
    public static void printPairsInArray(int numbers[]){
        int totalpairs = 0;
        for (int i =0; i<numbers.length ; i++){
            int current = numbers[i];
            for(int j= i+1 ; j<numbers.length ; j++){
                System.out.print("(" +current+","+numbers[j]+ ")");
                totalpairs++;
            } 
            System.out.println();
        }
        System.out.println("total pairs ="+ totalpairs);
        
    }
    public static void main(String args[]){
        int numbers[] = {2,4,6,8,0};
        printPairsInArray(numbers);
        

    }
}