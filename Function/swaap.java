import java.util.*;
public class swaap {
    public static void main(String[] args) {
        Scanner sc=new Scanner (System.in);
        // swap-value exchange
        System.out.println("enter the first no.=");
        int a=sc.nextInt();
        System.out.println("enter the second no.=");
        int b=sc.nextInt();
        //swap
        int temp=a;
        a=b;
        b=temp;
        System.out.println("after swapping");
        System.out.println("first no. is "+a);
        System.out.println("second no. is "+b);
    }
}
