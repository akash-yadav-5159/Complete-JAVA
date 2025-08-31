import java.util.*;
public class create{
    public static void main(String args[]){
        String str="abcd";
        String str2=new String("xyz");
        System.out.println(str);
        System.out.println(str2);
        //Strings of java are immutable
        Scanner sc=new Scanner(System.in);
        String name;
        name=sc.nextLine();//for  single without space we use only next(), but when we want to print the multiple word with space, then we use nextline()
        System.out.print(name);
    }
}