public class assignment {
    //       swapping by xor
    public static void main(String[] args) {
        int x=3,y=98;
        x=x^y;y=x^y;x=x^y;
        System.out.println(x+","+y);

        // ADD using bit manipulation

        int p=6;
        System.out.print(-~-~p);
    }
    /*public static void main(String args[]){
        int a=5;
        int b=4;
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.print(a+","+b);
    }*/
}
