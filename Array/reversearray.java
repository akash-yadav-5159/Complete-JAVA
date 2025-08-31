import java.util.*;
public class reversearray{
    public static void reverse(int number[]){
        int n=number.length;
        int b[]=new int[n];
        for (int i=0;i<=n-1;i++){
            b[i]=number[n-1-i];
        }
        for (int k = 0; k < n; k++) {
            System.out.print(" "+b[k]);
        }//time and space complexity is more because it need extra space for creating helping array
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4,5};
        reverse(number);
    }
}
