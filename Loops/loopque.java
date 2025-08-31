import java.util.Scanner;
public class loopque {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int number,choice,evensum=0,oddsum=0;
        do{
            System.out.println("enter the no.=");
            number=sc.nextInt();
            if(number%2==0){
                evensum=evensum+number;
            }
            else{
                oddsum=oddsum+number;
            }
            System.out.println("enter 1 for continue and 2 for terminate");
            choice=sc.nextInt();
        }while(choice==1);
        System.out.println("evensum"+evensum);
        System.out.println("oddsum"+oddsum);        
    }
}