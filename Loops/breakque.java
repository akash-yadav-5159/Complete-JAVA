import java.util.*;
public class breakque {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        do{
            System.out.print("Enter no.=");
            int a=sc.nextInt();
            if(a%10==0){
                break;
            }
            System.out.println(a);
        }while(true);
        System.out.print("terminated, because no. is multiple of 10");
    }
}
