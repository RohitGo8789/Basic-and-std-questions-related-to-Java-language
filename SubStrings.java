//Printing Sub strings
public class Strings{
    public static String printSubString(String str, int si, int ei){
        String SubStr = "";
        for(int i = si; i < ei; i++){
            SubStr += str.charAt(i); 
        }
        return SubStr;
    }
    public static void main(String args[]){
        String str = "ROHITGOSWAMI";
        // System.out.println(printSubString(str,2,6));
      //using in built java funtion
        System.out.println(str.substring(0,5));
    }
}
