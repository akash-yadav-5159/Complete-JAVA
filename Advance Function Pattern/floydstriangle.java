public class floydstriangle {
    public static void floyd(int length){
        int p=1;
        for (int i=1;i<=length;i++){
            for(int j=1;j<=i;j++){
                System.out.print(p+"      ");
                p++;
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        floyd(5);
    }
}
