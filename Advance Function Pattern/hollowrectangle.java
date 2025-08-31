public class hollowrectangle {
    public static void hollow_rectangle(int rows, int columns){
        for(int i=1;i<=rows;i++){
            for(int j=1;j<=columns;j++){
                if((i==1||i==rows)||(j==1||j==columns)){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        hollow_rectangle(5,15);
    }
}
/*   public static void main(String args[]){
        int length=12;
        int breadth=8;
        for(int i=1;i<=breadth;i++){
            if((i==1)||(i==breadth)){
                for(int j=1;j<=length;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
            else{
                for(int j=1;j<=length;j++){
                    if((j==1)||(j==length)){
                        System.out.print("*");
                    }
                    else{
                        System.out.print(" ");
                    }
                
                }
                System.out.println();
            }
        }
    }
}*/