import java.nio.channels.NonReadableChannelException;

public class ArrayAsArgument{


    public static void updateArray(int marks[],int nonChangable){
        nonChangable = 5;
        for(int i=0; i<marks.length ; i++){
        marks[i]= marks[i]+1;
        }    
    }
    public static void main(String args[]){
    int marks[] = {98,98,99};
    int nonChangable = 10;
   // updateArray(marks);
    updateArray(marks, nonChangable);
    for(int i=0; i<marks.length ; i++){
        System.out.println(marks[i]+" ");   // callbyreference : will change
    }
    System.out.println(nonChangable);     //callbyvalue : will not chnage


    }
}