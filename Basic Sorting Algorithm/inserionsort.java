import java.util.Arrays;
public class inserionsort {
    public static void insertion_sort(int arr[]){
        for(int turn=1;turn<arr.length;turn++){
            int key=arr[turn];
            int prev=turn-1;
            while(prev>=0&&arr[prev]>key){
                arr[prev+1]=arr[prev];
                prev--;
            }
            arr[prev+1]=key;
        }
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        insertion_sort(arr);
    }
}
