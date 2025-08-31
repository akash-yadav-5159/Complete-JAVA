import java.util.*;
public class printreverse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.=");
        int a=sc.nextInt();
        int sum;
        while(a>0){
            sum=a%10;
            System.out.print(sum);
            a/=10;
        }
    }
}
