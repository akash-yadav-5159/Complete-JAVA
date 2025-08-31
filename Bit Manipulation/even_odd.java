import java.util.*;
public class even_odd {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the integer");
        int num=sc.nextInt();
        if((num&1)==1){
            System.out.print("no. is odd");
        }else{
            System.out.print("no. is even");
        }
    }
}
