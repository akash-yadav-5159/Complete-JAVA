import java.util.*;
public class compareof2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the a no=");
        int a=sc.nextInt();
        System.out.print("Enter the b no=");
        int b=sc.nextInt();
        //it is example of nested else if 23
        if(a>b){
            System.out.print("a is greater than b");
        }
        else if(a<b){
            System.out.print("a is smaller than b");
        }
        else{
            System.out.print("a is equal to b");   
        }
    }
}
