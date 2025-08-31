public class bubblesort{
    public static void bubblesort(int arr[]){
        int swap=0;
        for(int turn=0;turn<arr.length-1;turn++){
            for(int i=0;i<arr.length-1-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                    swap++;
                }
            }
            if(swap==0){
                break;
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}
/*public class bubblesort{
    public static void bubblesort(int arr[]){
        for(int turn=0;turn<arr.length-1;turn++){
            for(int i=0;i<arr.length-1-turn;i++){
                if(arr[i]>arr[i+1]){
                    int temp=arr[i+1];
                    arr[i+1]=arr[i];
                    arr[i]=temp;
                }
            }
        }
    }
    public static void main(String[] args) {
        int arr[]={5,4,1,3,2};
        bubblesort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
} */