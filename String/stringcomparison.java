public class stringcomparison {
    public static void main(String[] args) {
        String str="tony";
        String str2="tony";
        String str3=new String("tony");
        if((str).equals(str3)){//  .equals function compare only its value
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are unequal");
        }
    }
}
    /*    String str="tony";
        String str2="tony";
        String str3=new String("tony");
        if(str==str2){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are unequal");
        }
        if(str==str3){
            System.out.println("String are equal");
        }
        else{
            System.out.println("String are unequal");
        }
    }
}*/
// here str store the value and str2 points the same string stored in str, but in case of str 3 it create new memory which store the string tony, but does not point he same sring store in str
