/*
1
12
123
1234
*/
//HALF PYRAMID PATTERN
public class Patterns {
    public static void main(String args[]){
        int n = 4;
        for(int line = 1; line <= n; line++){
            for(int num = 1; num <= line; num++){
                System.out.print(num);
            }
            System.out.println();
        }
    }
}