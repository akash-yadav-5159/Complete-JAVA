import java.util.*;
public class even {
    public static void main(String[] args) {
        Scanner yo=new Scanner(System.in);
        System.out.print("enter the no. you want to check");
        int a=yo.nextInt();
        if (a%2==0){
            System.out.print("no. is even");
        }
        else{
            System.out.print("no. is odd");
        }
    }
}
