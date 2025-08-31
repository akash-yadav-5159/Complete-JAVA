public class bintodec {
    public static void binarytodecimal(int binum){
        int pow=0;
        int dec=0;
        while(binum>0){
            int last=binum%10;
            dec=dec+(int)(last*Math.pow(2,pow));
            binum/=10;
            pow++;
        }
        System.out.println(dec);
    }
    public static void main(String[] args) {
        binarytodecimal(0);
        binarytodecimal(110101);
        binarytodecimal(1101);

    }
}
