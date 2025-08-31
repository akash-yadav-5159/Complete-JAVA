public class Clear_last_ith_bit {
    public static void main(String[] args) {
        int num=31;
        int pos=2;
        int bitmask=-1<<pos;
        System.out.print(bitmask&num);
    }
}
