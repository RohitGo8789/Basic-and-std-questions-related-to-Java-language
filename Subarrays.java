// PRINT SUBARRAYS

public class Subarrays {
    public static void printSubarrays(int a[]){
        int ts = 0;
        for(int i = 0; i < a.length; i++){
            int start = i;
            for(int j = i; j < a.length; j++){
                int end = j;
                for(int k = start; k <= end; k++){
                    System.out.print(a[k] + " "); //subarrays
                }
                ts++;
                System.out.println();
            }
            System.out.println();
        }
        System.out.println("Total subarrays are: " + ts);
    }
    public static void main(String args[]){
        int a[] = {2,4,6,8,10};
        System.out.println("Subarrays are: ");
        printSubarrays(a);

    }
}
