public class palindromr {
    public static boolean palindrome(String str){
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i)!=str.charAt(str.length()-1-i)){
                System.out.print("String is not palindome");
                return false;
            }
        }
        System.out.print("String is palindome");
        return true;
    }
    public static void main(String[] args) {
        String str="racecar";
        palindrome(str);
    }
}
