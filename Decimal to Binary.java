//DECIMAL TO BINARY
public class Functions{
    //funtion for conversion of decimal number into binary number
    public static void decTobin(int decNum){
        int myNum = decNum;
        int binNum = 0;
        int pow = 0;
        while (decNum > 0){
            int rem = decNum % 2;
            binNum = binNum + (rem * (int)Math.pow(10,pow));
            pow++;
            decNum = decNum/2;

        }
        System.out.println("Binary of " + myNum + " is = " + binNum);
    }
    public static void main(String args[]){
        decTobin(7);

    }
}
