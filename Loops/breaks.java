public class breaks {
    public static void main(String[] args) {
        int i;
        for(i=1;i<=10;i++){
            if(i==7){
                break;
            }
            System.out.println(i);
        }
        System.out.println("i am out of the loop");
    }
}
