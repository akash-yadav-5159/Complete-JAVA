//use all the four bubble, seleection, insertion and counting algorithm to sort [3,6,2,1,8,7,4,5,3,1]
import java.util.Arrays;
public class Assignment {
    public static void printarr(int arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }//          Counting Sort
    public static void Counting(int arr[]){
        int largest=Integer.MIN_VALUE;;
        for(int i=0;i<arr.length;i++){
            largest=Math.max(largest,arr[i]);
        }
        int count[]=new int[largest+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        int j=0;
        for(int i=0;i<count.length;i++){
            while(count[i]>0){
                arr[j]=i;
                j++;
                count[i]--;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,0,8,7,4,5,1};
        Counting(arr);
        printarr(arr);
    }
}   
/*           Insertion Sort    

    public static void insertion(int arr[]){
        for(int i=1;i<arr.length;i++){
            int key=arr[i];
            int j=i-1;
            while(j>=0&&arr[j]>key){
                arr[j+1]=arr[j];
                j--;
            }
            arr[j+1]=key;
        }
    }*/ 
/*               Selection Sort

   public static void selection_sort(int arr[]){
        for (int turn=0;turn<arr.length-1;turn++){
            int minpos=turn;
            for(int i=turn+1;i<arr.length;i++){
                if(arr[minpos]>arr[i]){
                    minpos=i;
                }
            }
            int temp=arr[minpos];
                arr[minpos]=arr[turn];
                arr[turn]=temp;    

        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        selection_sort(arr);
        printarr(arr);
    }
} *?
/*                bubblesort 

    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int i=0;i<arr.length-turn-1;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i];
                    arr[i]=arr[i+1];
                    arr[i+1]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={3,6,2,1,8,7,4,5,3,1};
        bubblesort(arr);
        printarr(arr);
    }
}*/
