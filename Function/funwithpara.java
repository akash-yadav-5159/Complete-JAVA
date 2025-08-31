import java.util.*;
public class funwithpara{
    public static int add(int a, int b){ //here a and b is parameter/ values during function input(fomal parameter)
        int lebhai = a+b;
        return lebhai;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int m=sc.nextInt();
        int n=sc.nextInt();
        int sum=add(m,n);// here m and n is argument/ values during function calling(actual parameter)
        System.out.print("sum is "+sum);
    }
}

