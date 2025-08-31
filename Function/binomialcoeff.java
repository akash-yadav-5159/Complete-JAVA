public class binomialcoeff {
    public static int factorial(int a){
        int factorials=1;
        for(int i=1;i<=a;i++){
            factorials*=i;
        }
        return factorials;
    }
    public static int binocoeff(int n,int r){
        int fact_n=factorial(n);
        int fact_r=factorial(r);
        int fact_nmr=factorial(n-r);
        int lebhai=(fact_n/(fact_r*fact_nmr));
        return lebhai;
    }
    public static void main(String[] args) {
        int ncr=binocoeff(7,4);
        System.out.print(ncr);
    }
}
