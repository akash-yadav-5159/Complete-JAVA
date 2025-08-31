import java.util.*;
public class checkprime {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        boolean d=true;
        System.out.print("enter the no.=");
        int n=sc.nextInt();
        if(n<=1){
            System.out.print("no. is not prime");
        }
        else if(n==2){
            System.out.print("no. is prime");
        }
        else{
            //for(int div=2;div<n-1;div++){-- general method
            for(int div=2;div<Math.sqrt(n);div++){ //for better optimization
                if(n%div==0){
                    d=false;
                    break;
                }
            }
            if(d==true){
                System.out.print("no. is prime");
            }
            else{
                System.out.print("no. is not prime");
            }
        }
    }
}