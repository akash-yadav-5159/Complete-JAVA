public class power_of_two {
    public static void check(int a){
        if((a&(a-1))==0){
            System.out.print("no. is power of 2");
        }
        else{
            System.out.print("no. is not power of 2");
        }
    }
    public static void main(String[] args) {
        check(166);
    }
}
