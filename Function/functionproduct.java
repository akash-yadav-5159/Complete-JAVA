import java.util.*;
public class functionproduct {
    public static int mul(int a, int b){
        int mul=a*b;
        return mul;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter no. a");
        int m=sc.nextInt();
        System.out.println("enter no. b");
        int n=sc.nextInt();
        int product=mul(m,n);
        System.out.println("product of a and b is "+product);
    }
}
