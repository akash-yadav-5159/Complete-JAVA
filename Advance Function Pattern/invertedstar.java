import java.util.*;
public class invertedstar {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the no. upto, which yo want descending pattern ");
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=(n+1-i);j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
