public class invertedhalfpyramid {
    public static void inverted_half_pyramid(int n){
        for (int i=1;i<=n;i++){
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
            // for stars
            for(int k=1;k<=i;k++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        inverted_half_pyramid(10);
    }
}