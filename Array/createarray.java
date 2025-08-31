import java.util.*;
public class createarray {
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc=new Scanner (System.in);
        System.out.print("Enter Physics marks=");
        marks[0]=sc.nextInt();
        System.out.print("Enter Chemistry marks=");
        marks[1]=sc.nextInt();
        System.out.print("Enter Biology marks=");
        marks[2]=sc.nextInt();
        System.out.println("Physics:"+marks[0]);
        System.out.println("Chemistry:"+marks[1]);
        System.out.println("Biology:"+marks[2]);
        marks[0]=35;
        System.out.println("Physics:"+marks[0]);
        double per=(marks[0]+marks[1]+marks[2])/3.0;
        System.out.println("Precentage:"+per);
        System.out.print("Length of array:"+marks.length);
    }
}
