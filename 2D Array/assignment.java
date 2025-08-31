import java.util.*;
public class assignment {
    public static void transpose(int matrix[][]){
        int trans[][]=new int[matrix[0].length][matrix.length];
        System.out.println("Transpose of given matrix is:-");
        for(int i=0;i<matrix[0].length;i++){
            for(int j=0;j<matrix.length;j++){
                trans[i][j]=matrix[j][i];
                System.out.print(trans[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the dimension of a matrix ");
        int row=sc.nextInt();
        int column=sc.nextInt();
        int matrix[][]=new int[row][column];
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Given matrix is :- ");
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        transpose(matrix);
    }
}
/*    public static void sum(int matrix [][]){
        int sum=0;
        for(int j=0;j<matrix[0].length;j++){
            sum+=matrix[1][j];
        }
        System.out.print("sum of element of second row is "+sum);
    } 
    public static void main(String[] args) {
        int matrix[][]={{1,4,9},{11,4,3},{2,2,3}};
        sum(matrix);
    }
}*/
/*
    public static void count(int matrix[][],int key){
        int counting=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    counting++;
                }
            }
        }
        System.out.print(counting);
    }
    public static void main(String[] args) {
        int matrix[][]={{4,7,8},{8,8,7}};
        count(matrix,8);
    }
}*/
