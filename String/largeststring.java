import java.util.*;
public class largeststring {
    public static void main(String[] args) {
        String fruit[]={"apple","banana","mango","litchi"};
        String largest=fruit[0];
        for(int i=1;i<fruit.length;i++){
            if(largest.compareTo(fruit[i])<0){//function str1.compareTo(str2)
                largest=fruit[i];
            }
        }
        System.out.print("Largest element lexicographically is "+largest);
    }
} 
