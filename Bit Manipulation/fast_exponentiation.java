public class fast_exponentiation {
    public static int fast_exponentiation_(int a, int b){
        int ans=1;
        while(b!=0){
            if((b&1)==1){
                ans=ans*a;
            }
            a*=a;
            b=(b>>1);
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.print(fast_exponentiation_(2,21));
    }
}
