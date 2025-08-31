import java.util.Scanner;
public class factorial {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a no.=");
        int n=sc.nextInt();
        int i=n;
        if(n==0||n==1){
            System.out.println("factorial is 1");
        }
        else{
            while(i>1){
            n*=(i-1);
            i--;
        }
        System.out.println("factorial is "+n);
        }
    }
}
