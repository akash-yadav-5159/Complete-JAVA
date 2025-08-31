import java.util.*;
public class get_ith_bit {
    public static void main(String[] args) {
        System.out.print("Enter the number ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        System.out.print("Enter the bit position from last ");
        int pos=sc.nextInt();
        if(((num>>pos-1)&1)==1){
            System.out.print(1);
        }else{
            System.out.print(0);
        }     
    }
}
