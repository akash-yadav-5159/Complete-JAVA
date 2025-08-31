public class subarrays {
    public static void sub(int num[]){
        int count=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int start=i;
            for(int j=i;j<num.length;j++){
                int sum=0;
                int end=j;
                for(int k=start;k<=end;k++){
                    sum=sum+num[k];
                    System.out.print(" "+num[k]);
                }
                System.out.print(" (sum is "+sum+")");
                if(sum>=max){
                    max=sum;
                }
                System.out.print("  ");
            count++;
            }
            System.out.println();
        }
        System.out.print("total subarraay is "+count);
        System.out.print("max sum of subarray is "+max);
    }
    public static void main(String[] args) {
        int num[]={5,7,-3,-2,55,-9};
        sub(num);
    }
}//sum brute force-time complexity maxixmum(n pwwer 3 because of 3 nested for loop)
