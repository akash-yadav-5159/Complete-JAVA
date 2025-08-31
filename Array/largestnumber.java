import java.util.*;
public class largestnumber {
    public static int comparator(int arrays[]){
        int k=Integer.MAX_VALUE;// for largest value we use Integer.MAX_VALUE
        for(int i=0;i<arrays.length;i++){
            if(arrays[i]<k){
                k=arrays[i];
            }
        }
        return k;
    }
    public static void main(String[] args) {
        int arrays[]={59,8,33,245,-3,23,2,36,18};
        int comp=comparator(arrays);
        System.out.print("smallest number is:"+comp);
    }
}
