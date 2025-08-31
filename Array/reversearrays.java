public class reversearrays {
    public static void reverse(int array[]){
        int n=array.length;
        int start=0,end=n-1;
        while(start<end){
            int temp=array[start];
            array[start]=array[end];
            array[end]=temp;
            start++;
            end--;
        }
    }//it is good because it reduce space complexity, we don't need to create extra space for it
    public static void main(String[] args) {
        int array[]={1,2,3,4,5,6};
        reverse(array);
        for(int i=0;i<array.length;i++){
            System.out.print(" "+array[i]);
        }
    }
}
