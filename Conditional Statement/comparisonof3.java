import java.util.*;
public class comparisonof3 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first no=");
        int a=sc.nextInt();
        System.out.print("Enter the second no=");
        int b=sc.nextInt();
        System.out.print("Enter the third no=");
        int c=sc.nextInt();
        if(a>b&&a>c){
            System.out.print("a is largest");
        }
        else if(b>c){
            System.out.print("b is largest");
        }
        else{
            System.out.print("c is largest");
        }
    }
}        
/*         if (a>b){
            if(a>c){
                System.out.print("first is largest");
            }
            else{
                System.out.print("third is largest"); 
            }
        }
        else{
            if(b>c){
                System.out.print("second is largest");
            }
            else{
                System.out.print("third is largest");
            }
        }
    }
}*/

