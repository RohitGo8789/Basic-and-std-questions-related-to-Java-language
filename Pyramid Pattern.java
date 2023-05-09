/*
      *
     **
    ***
   ****
*/  
 
//INERTED AND ROTATED HALF PYRAMID
public class AdvPatterns{
    public static void half_pyramid(int totRows){
        for(int i = 1; i <= totRows; i++){
            //spaces
            for(int j = 1; j <= totRows-i; j++){
                System.out.print(" ");

            }
             //stars
             for(int j= 1; j <= i; j++){
                   System.out.print("*");
            }
            System.out.println();
        }
        
    }
    public static void main(String args[]){
        half_pyramid(10);

    }
}
