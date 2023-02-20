import java.util.Scanner;

public class Swap2 {
    public static void main(String[] args) {
        int a ,b;
        System.out.println("enter any 2 number");
        Scanner r=new Scanner(System.in);
        a=r.nextInt();
        b=r.nextInt();
        System.out.println("before swaping"+ a +" "+b);
        a = a + b;
        b = a - b;
        a = a - b;
        System.out.println("After swapping= " + a + " " + b);
    }
}