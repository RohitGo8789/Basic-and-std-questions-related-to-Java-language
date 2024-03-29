import java.util.*;
public class ShortestPathUsingStrings {
    public static float shortestPath(String str){
        int x = 0;
        int y = 0;
        for(int i = 0; i < str.length(); i++){
            if(str.charAt(i)=='W'){
                x -= 1;
            }else if(str.charAt(i)=='E'){
                x += 1;
            }else if(str.charAt(i)=='N'){
                y += 1;
            }else{
                y -= 1;
            }
        }
        int X2 = x*x;
        int Y2 = y*y;
        return (float)Math.sqrt(X2+Y2);
    }
    public static void main(String args[]){
        String str = "WNEENESENNN";
        System.out.println(shortestPath(str));

    }
}
