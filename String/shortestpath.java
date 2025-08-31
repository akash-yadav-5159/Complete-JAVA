public class shortestpath {
    public static void shortest(String str){
        int x=0;
        int y=0;
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)=='W'){
                y-=1;
            }
            else if(str.charAt(i)=='E'){
                y+=1;
            }
            else if(str.charAt(i)=='S'){
                x-=1;
            }
            else if(str.charAt(i)=='N'){
                x+=1;
            }
        }
        int result=(int)Math.pow(x-0,2)+(int)Math.pow(y-0,2);
        System.out.print(Math.sqrt(result));
    }
    public static void main(String[] args) {
        String path="WNNEENENENENENENENENENENEN";
        shortest(path);
    }
}
