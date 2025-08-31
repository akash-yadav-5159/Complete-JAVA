public class immmutable {
    public static void main(String[] args) {
        String str="Tony";
        for(char x='a';x<='z';x++){
            str=str+x;
        }
        System.out.println(str+" ");
        System.out.print(str.length());
        // during each iteration it create a new copy of the previous one
    }
}
