import java.util.*;
public class ternary2 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the marks obtained");
        int a=sc.nextInt();
        String type=(a>=33)?"pass":"fail";
        System.out.print(type);        
    }
}
