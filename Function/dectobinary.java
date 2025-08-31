public class dectobinary {
    public static void dectobin(int n){
        int bin=0;
        int pow=0;
        while(0<n){
            int rem=n%2;
            bin=bin+rem*(int)(Math.pow(10,pow));
            n/=2;
            pow++;
        }
        System.out.println(bin);
    }
    public static void main(String[] args) {
        dectobin(27);
    }
}
