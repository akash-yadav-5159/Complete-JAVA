import java.util.Arrays;
import java.util.Collections;
public class inbuilt {
    //for reverse order we use extra Collections function for implemenration with Arrays
    //* contain all the functions and classes
    //time complexity of sort function is n(logn)
    //Collections functions work on object types data(Integer) not on primitive type data like (int) 
    public static void main(String[] args) {
        Integer given[]={8,7,6,4,2,3,1};
        Arrays.sort(given,3,6,Collections.reverseOrder());
        //if we do not provide range, it will short all th element of an array and note range(end) of last element is exclusive
        for (int i=0;i<given.length;i++){
            System.out.print(given[i]+" ");
        }
    }
} 
/*import java.util.Arrays;
public class inbuilt {
    public static void main(String[] args) {
        Integer given[]={7,6,4,8,2,3,1};
        Arrays.sort(given,0,4);
        //if we do not provide range, it will short all th element of an array and note range(end) of last element is exclusive
        for (int i=0;i<given.length;i++){
            System.out.print(given[i]+" ");
        }
    }
}*/
 