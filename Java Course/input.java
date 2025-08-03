import java.util.*;
public class input {

    public static void main(String[] args) {
        //Scanner sc=new Scanner(System.in);
        //String input=sc.next();
        //Scanner sc=new Scanner(System.in);
        //String input=sc.nextLine();
        // here we store only character until space is there, if we want to store space also then we use nextLine instead only next
        Scanner yo=new Scanner(System.in);
        int input=yo.nextInt();
        //here we use nextFloat,nextInt,nextDouble,nextLong function depending on the data type we stored
        System.out.println(input);
    }
}


