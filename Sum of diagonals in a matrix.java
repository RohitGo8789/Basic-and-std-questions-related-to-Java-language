public class DiagonalSum {
    public  static int diagonalSum(int matrix[][]){
    // time complexity will be O(n^2).    
    //     int sum = 0; 

    //     for(int i = 0 ; i <matrix.length; i++){
    //         for(int j = 0; j <matrix[0].length; j++){
    //             //primary diagonal
    //             if(i==j){
    //                 sum += matrix[i][j];
    //             //secondary diagonal    
    //             }else if(i+j==matrix.length-1){
    //                 sum += matrix[i][j];
    //             }
    //         }
    //     }
    //     return sum;

    // time complexity will be O(n)
    //primary diagonal
    int sum = 0;
    for(int i = 0 ; i < matrix.length; i++){
        sum += matrix[i][i];
        //secondary diagonal
        if(i != matrix.length-1-i){
            sum += matrix[i][matrix.length-1-i];
        }
    }
    return sum;
     }
    public static void main(String args[]){
        int matrix[][] = {{1,2,3},
                           {4,5,6},
                        {7,8,9}};
        System.out.println(diagonalSum(matrix));                 
    }
    
}
