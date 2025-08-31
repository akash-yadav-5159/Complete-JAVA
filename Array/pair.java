public class pair {
    public static void pair (int num[]){
        int count=0;
        for (int i=0;i<num.length;i++){
            int curr= num[i];
            for(int j=i+1;j<num.length;j++){
                System.out.print("("+curr+","+num[j]+")  ");
                count++;
            }
            System.out.println();
        }
        System.out.print("total pair is "+count);
    }
    public static void main(String[] args) {
        int num[]={1,2,3,4,5,6,7,8,9,10};
        pair(num);
    }
}

