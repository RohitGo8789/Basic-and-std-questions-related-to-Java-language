//Write a program to Find Transpose of a Matrix.
public class MatricesAssignment{
    public static void transposeMatrix(int matrix[][]){
        int transpose [][] = new int[matrix[0].length][matrix.length];
        for(int i = 0; i < matrix.length; i++){
            for(int  j = 0; j < matrix[0].length; j++){
                transpose[j][i] = matrix[i][j];
            }
        }
        printMatrix(transpose);
    }

    public static void printMatrix(int matrix[][]){
        for(int i = 0; i < matrix.length; i++){
            for(int  j = 0; j < matrix[0].length; j++){
                System.out.print(matrix[i][j]+ " ");
            }
            System.out.println();
        }            

    }
    public static void main(String args[]){
        int matrix[][] = {{2,4,6},{3,7,9}}; 
        transposeMatrix(matrix);

    }
}
