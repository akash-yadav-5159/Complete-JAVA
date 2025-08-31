import java.util.*;
public class reverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.=");
        int a=sc.nextInt();
        int rev=0,l;
        while(a>0){
            l=a%10;
            rev=10*rev+l;
            a=a/10;
        }
        System.out.print(rev);
    }
}
