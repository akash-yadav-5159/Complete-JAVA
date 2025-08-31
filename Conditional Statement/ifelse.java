import java.util.*;
public class ifelse {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age=");
        int n=sc.nextInt();
        if(n>=18){
            System.out.println("adult= drive,vote");
        }
        else{
            System.out.println("not adult");
        }
    }
}
