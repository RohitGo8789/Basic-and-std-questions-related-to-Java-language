import java.util.*;
public class Matrices {
    //Searching in Matrix
    public static boolean searchMatrix(int matrix[][], int key){
        for(int i = 0; i < matrix.length; i++){
            for(int j = 0 ; j < matrix[0].length; j++){
                if(matrix[i][j]==key){
                    System.out.print("Key is found at index: "+"("+ i +","+ j+ ")");
                    return true;
                }
            }
        }
        System.out.println("Key is not found");
        return false;

    }
    // Creation of 2-D arrays
    public static void main(String args[]){
        int matrix[][] = new int[3][3];
        int n = matrix.length; int m = matrix[0].length;
        Scanner sc = new Scanner(System.in);
        for(int i = 0; i < n; i++){
            for(int j = 0 ; j < m; j++){
                matrix [i][j] = sc.nextInt();

            }
        }

        //output
        for(int i = 0; i < n; i++){
            for(int j = 0; j < m; j++){
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        searchMatrix(matrix,5);

    }
    
    
}
