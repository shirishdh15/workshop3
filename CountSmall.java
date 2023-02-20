import java.util.Scanner;

public class CountSmall {
    public static void main(String[] args) {
        int[] array ={1,4,6,3,2,1};
        int  a=array[0];
        int count=0;
        for(int i=1;i< array.length;i++){
            if(array[i]<a){
                a=array[i];
            }
        }
        System.out.println("minimum element is " +a);
        for(int i=0;i< array.length;i++){
            if(array[i]==a){
                count = count+1;
            }
        }
        System.out.println("the elemnt appeared "+ count+" times");
    }
    }