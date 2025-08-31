import java.util.*;
public class continueque {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("enter the no.=");
        do{
            int s=sc.nextInt();
            if(s%10==0){
                continue;
            }
            System.out.println(s);
        }while(true);
    }
}
