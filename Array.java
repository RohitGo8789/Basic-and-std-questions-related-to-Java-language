import java.util.*;
public class Arrays {
    public static void update(int marks[]){
        for(int i = 0; i < marks.length; i++){
            marks[i] += 1;
        }

    }
    public static void main(String args[]){
        int marks[] = {88,95,78};

        update(marks);

        //printing the output
        for(int i = 0; i < marks.length; i++){
            System.out.println(marks[i]);
        }
    }
} 
