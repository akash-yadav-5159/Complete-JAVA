public class update_ith_bit {
    public static int set(int num, int bitmask){
        return (num|bitmask);
    }
    public static int clear(int num, int bitmask){
        return (num&(~bitmask));
    }
    public static int update(int num, int pos,int  bit){
        int bitmask=1<<pos-1;
        if(bit==1){
            return set(num,bitmask);
        }else{
            return clear(num,bitmask);
        }
    }
    public static void main(String[] args) {
        int num=16;
        int pos=5;
        System.out.print(update(num,pos,0));
    }
}
