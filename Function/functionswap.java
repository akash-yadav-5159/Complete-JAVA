import java.util.*;
public class functionswap {
    public static void swap(int a, int b){
        int temp;
        temp=a;
        a=b;
        b=temp;
        System.out.println("after swappinng a is "+a);
        System.out.println("after swappinng b is "+b);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. a");
        int m=sc.nextInt();
        System.out.println("enter no. b");
        int n=sc.nextInt();
        swap(m,n);
    }
}
