public class Selectionsort {
    public static void selectionsort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
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
        int arr[]={5,4,45,67,21,89,1,3,2};
        selectionsort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }
}
