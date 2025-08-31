import java.util.*;
public class binarysearch {
    public static int binarysearch(int number[], int key){
        int start=0, end=number.length-1;
        while(start<=end){
            int mid=(start +end)/2;
            //comparison
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<key){//right 
                start=mid+1;
            }
            if(number[mid]>key){//left
                end=mid-1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int number[]={10,13,15,17,21,22,29,66};
        int k=77;
        int index=binarysearch(number,k);
        if(index==-1){
            System.out.print("NOt Found");
        }
        else{
            System.out.print("key is at index:"+index);
        }
    }
}
