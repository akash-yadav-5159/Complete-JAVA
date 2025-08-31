public class clear_range_ofBit {
    public static int clear_range(int a,int b, int c){
        int bitmask2=(~(-1<<(b-1)));
        int y=(a&bitmask2);
        int bitmask=-1<<c;
        int x=(a&bitmask);
        return (x|y);
    }
    public static void main(String[] args) {
        System.out.print(clear_range(10,3,4));
    }
}
