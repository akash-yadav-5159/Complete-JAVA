public class substring {
    public static String substring(String str, int si, int ei){
        String substr="";
        for(int i=si;i<ei;i++){
            substr=substr+str.charAt(i);
        }
        return substr;
    }
    public static void main(String[] args) {
        String str="HelloWorld";//instead writing whole code we can directly use (name.substring(x,y)) for printing substring from range x to y
        //System.out.print(substring(str,0,5));
        System.out.print(str.substring(3,6));
    }
}
