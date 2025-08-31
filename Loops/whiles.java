import java.util.*;
public class whiles {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no.");
        int n=sc.nextInt();
        int sum=0,i=1;
        while(i<=n){
            sum+=i;
            i++;
        }
        System.out.println(sum);
    }
}    
        
