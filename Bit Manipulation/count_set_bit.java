public class count_set_bit {
    public static int count(int a){
        int count=0;
        while(a!=0){
            if((a&1)==1){
                count++;
            }
            a=(a>>1);
        }
        return count;
    }
    public static void main(String[] args) {
        System.out.print(count(16));
    }
}
