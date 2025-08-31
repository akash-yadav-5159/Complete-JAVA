public class charat {
    public static void Print_letters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        String my_name="Akash YAduvanshi";
        Print_letters(my_name);
    }
}
