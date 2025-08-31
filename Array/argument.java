public class argument {
    public static void update(int marks[], int nonchangeable){
        nonchangeable=10;
        for(int i=0;i<=marks.length-1;i++){
            marks[i]=marks[i]+1;
        }
    }
    public static void main(String[] args) {
        int marks[]={97,98,99};
        int nonchangeable=5;
        update(marks,nonchangeable);
        for(int i=0;i<=marks.length-1;i++){
            System.out.print(marks[i]+" ");
        }
        System.out.println();
        System.out.print(nonchangeable);
    }
}// so, array work on call by value an
