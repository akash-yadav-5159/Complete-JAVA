import java.util.*;
public class diagonalsum {
    public static void main(String[] args) {
        int sum=0;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the size of square matrix");
        int size=sc.nextInt();
        int matrix[][]=new int[size][size];
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        System.out.println("Matrix ix :-");
        for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
/*     brute force   for(int i=0;i<size;i++){
            for(int j=0;j<size;j++){
                if(i==j){sum+=matrix[i][j];
                }else if(i+j==size-1){
                    sum+=matrix[i][j];
                }
            }
        }*/
        for(int i=0;i<size;i++){
            sum+=matrix[i][i];
            if(i!=size-1-i){
                sum+=matrix[i][size-1-i];
            }
        }
        System.out.print("Sum of diagonal element is "+sum);
    }
}