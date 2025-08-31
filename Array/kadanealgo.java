public class kadanealgo {
    public static void kadanes(int number[]){
        int max=Integer.MIN_VALUE;
        int currsum=0;//it does not work for array whose all no. is negative
        for(int i=0;i<number.length;i++){
            if(currsum<=0){
                currsum=0;
                currsum=currsum+number[i];
            }
            else{
                currsum=currsum+number[i];
            }
            if(max<currsum){
                max=currsum;
            }
        }
        System.out.print("Max sum is : "+max);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3};
        kadanes(number);
    }
}
