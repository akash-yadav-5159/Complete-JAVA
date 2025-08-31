import java.util.*;
public class switchs{
    public static void main(String args[]){
        Scanner sc=new Scanner (System.in);
        System.out.print("enter a no=");
        int n=sc.nextInt();
        switch(n){
            case 1: System.out.print("go 1 step ahead");
                    break;
            case 2: System.out.print("go 2 step ahead");
                    break;
            case 3: System.out.print("go 3 step ahead");
                    break;
            case 4: System.out.print("go 4 step ahead");
                    break;
            case 5: System.out.print("go 5 step ahead");
            default:System.out.print("no walking, only sleeping");
        }
    }
}
// break is used tto skip the next cases of switch statement, otherwise it will execute all the next cases once when statement is true