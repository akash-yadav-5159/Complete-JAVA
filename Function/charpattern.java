public class charpattern {
    public static void main(String[] args){
        char ch='A';
        for (int i=1;i<=6;i++){
            for(int j=1;j<=i;j++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
/*discovery

public class charpattern {
    public static void main(String[] args) {
        for(int i=1;i<=4;i++){
            for(int j=(65+(i*(i+1))/2-i);j<=64+(i*(i+1))/2;j++){
                System.out.print((char)j);
            }
            System.out.println();
        }
    }
}*/