import java.util.*;
public class taxcalce {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the salary=");
        int a=sc.nextInt();
        double tax;
        if (a<=500000){
            tax=0;
            System.out.print("Tax is="+tax);
        }
        //else if(500000<a<=1000000){   syntactically incorrect in java, we cannot use chain for comparison intead we use logical operator
        else if(500000<a && a<=1000000){
            tax=0.1*a;
            System.out.print("Tax is="+tax);
        }
        else{
            tax=0.2*a;
            System.out.print("Tax is="+tax);
        }
    }
}
