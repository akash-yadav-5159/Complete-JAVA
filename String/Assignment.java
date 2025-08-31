import java.util.*;
public class Assignment {//Anagrams- words having same no. of letters and same alphabet, order may or may not be different
    public static void main(String[] args) {
        String str1="heartt",str2="eahhth";
        if(str1.length()==str2.length()){
            char[] str1array=str1.toCharArray();
            char[] str2array=str2.toCharArray();
            Arrays.sort(str1array);Arrays.sort(str2array);
            if(Arrays.equals(str1array,str2array)){
               System.out.print("it is anagrams"); 
            }else{
                System.out.print("it is not anagrams");
            }
        }else{
            System.out.print("it is not anagrams");
        }
    }
}
/*
    public static int count_lowercase(String str){
        int count=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        String str="Hi I aM AKash";
        System.out.print(count_lowercase(str));
    }
}*/
