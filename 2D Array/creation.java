import java.util.*;
public class creation {
    public static void smallest_largest(int matrix[][]){
        int smallest=Integer.MAX_VALUE;
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                smallest=Math.min(smallest,matrix[i][j]);
            }
        }
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                largest=Math.max(largest,matrix[i][j]);
            }
        }
        System.out.println("Smallest number is "+smallest);
        System.out.println("Largest number is "+largest);
    }
    public static boolean search(int matrix[][],int key){
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                if(matrix[i][j]==key){
                    System.out.println("Element is found at index ("+i+","+j+")");
                    return true;
                }
            }
        }
        System.out.print("Element not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]=new int[3][3];
        int m=matrix.length,n=matrix[2].length;
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                matrix[i][j]=sc.nextInt();
            }
        }
        //  output
        for(int i=0;i<m;i++){
            for(int j=0;j<n;j++){
                System.out.print(matrix[i][j]+" ");
            }
            System.out.println();
        }
        search(matrix,5);
        smallest_largest(matrix);
    }
}
