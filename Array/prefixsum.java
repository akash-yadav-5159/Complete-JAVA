public class prefixsum{
    public static void maxsubarray(int number[]){
        int currsum=0;
        int max=Integer.MIN_VALUE;
        int prefix[]=new int[number.length];
        prefix[0]=number[0];
        for(int i=1;i<prefix.length;i++){
            prefix[i]=prefix[i-1]+number[i];
        }
        for(int i=0;i<number.length;i++){
            int start=i;
            for(int j=0;j<number.length;j++){
                int end=j; 
                currsum=start==0 ? prefix[end]:prefix[start-1];
                if(max<currsum){
                    max=currsum;
                }
            }
        }
        System.out.print("max sum = "+ max);
    }
    public static void main(String[] args) {
        int number[]={1,-2,6,-1,3}; 
        maxsubarray(number);
    }
}
/*    public static void prefix(int num[]){
        int max=Integer.MIN_VALUE;
        for(int i=0;i<num.length;i++){
            int sum=0;
            int start=i;
            for(int j=i;j<num.length;j++){
                sum=sum+num[j];
                if(sum>=max){
                    max=sum;
                }
            }
        }
        System.out.print(max);
    }
    public static void main(String[] args) {
        int num[]={4,8,1,-30,45,23,-36,28};
        prefix(num);
    }
}*/