import java.util.*;
public class calce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("print first no.");
        int a=sc.nextInt();
        System.out.print("print second no.");   
        int b=sc.nextInt();
        System.out.print("select operator (+,-,*,/,%)");
        char c=sc.next().charAt(0);
        switch(c){
            case '+': System.out.print("a+b="+(a+b));
                    break;
            case '-': System.out.print("a-b="+(a-b));
                    break;
            case '*': System.out.print("a*b="+(a*b));
                    break;
            case '/': System.out.print("a+b="+(a/b));
                    break;
            case '%': System.out.print("a+b="+(a%b));
                    break;
            default:System.out.print("invalid operator is chosen");
        }    
    }
}
