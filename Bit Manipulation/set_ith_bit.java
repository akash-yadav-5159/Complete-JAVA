public class set_ith_bit {
    public static void main(String[] args) {
        int num=10;
        int set=1;
        int bitmask=1<<set-1;
        System.out.print(num|bitmask);
    }
}
