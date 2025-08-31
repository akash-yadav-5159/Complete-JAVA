public class pyramidwithno {
    public static void number_pyramid(int n){
        for(int i=1;i<=n;i++){
            for(int j=1;j<=n+1-i;j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        number_pyramid(5); 
    }
}
