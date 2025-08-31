import java.util.*;
public class starpattern {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. upto, which yo want ascending pattern ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            //one line
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
