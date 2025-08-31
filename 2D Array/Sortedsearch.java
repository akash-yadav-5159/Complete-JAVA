public class Sortedsearch {
    public static boolean stair_case_search(int matrix[][],int key){
        int row=0,column=matrix[0].length-1;
        while(row<matrix.length&&column>=0){
            if(matrix[row][column]==key){
                System.out.print("Element is found at index ("+row+","+column+")");
                return true;
            }
            else if(matrix[row][column]>key){
                column--;
            }
            else{
                row++;
            }
        }
        System.out.print("Element is not found");
        return false;
    }
    public static void main(String[] args) {
        int matrix[][]={{10,20,30,40},
                        {15,25,35,45},
                        {27,29,37,48},
                        {32,33,39,50},};
        stair_case_search(matrix,48);
    }
}
// normal approach is brute force when we check each element of the matrix line by line O(n*m)
//2nd approach is linear approach, here we apply sorting algo for each array line by line whose again time complexity is O(nlogm)
//but staircase time compleity is O(n+m) for matrix of order n*m