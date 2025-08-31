public class functionprimerange {
    public static boolean isprime(int n){
        boolean prime=true;
        if (n==2){
            return true;
        }
        for(int i=2;i<=Math.sqrt(n);i++){
            
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public static void range(int n){
        for(int i=1;i<=n;i++){
            if(isprime(i)){//true
                System.out.println(i);
            }
        }
        System.out.println();
    }
    public static void main(String[] args) {
        range(1000);
    }
}
