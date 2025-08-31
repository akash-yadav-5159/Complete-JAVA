import java.util.*;
public class functionfactorial {
    public static int factorial(int a){
        int factorials=1;
        for(int i=1;i<=a;i++){
            factorials*=i;
            
        }
        System.out.println("factorial is "+factorials);
        return factorials;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the no. for factorial ");
        int m=sc.nextInt();
        int n=sc.nextInt();
        int o=sc.nextInt();
        factorial(m);
        factorial(n);
        factorial(o);
    }
}
