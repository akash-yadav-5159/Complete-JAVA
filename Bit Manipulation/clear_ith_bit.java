public class clear_ith_bit {
    public static void main(String[] args) {
        int num=10;
        int clear=4;
        int bitmask=~(1<<clear-1);
        System.out.print(num&bitmask);

    }
}
