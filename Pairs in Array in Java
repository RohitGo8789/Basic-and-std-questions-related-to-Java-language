public class PairsInArray {
    public static void pairs(int a[]){
        int totalPairs = 0;
        for(int i = 0 ; i < a.length; i++){
            int curr = a[i]; //2,4,6,8,10
            for(int j = i+1; j < a.length; j++){
                System.out.print("(" + curr + "," + a[j] + ")");
                totalPairs++;
            }
            System.out.println();
            
        }
        System.out.println("Total pairs: " + totalPairs);
    }
    public static void main(String args[]){
        int a[] = {2,4,6,8,10};
        System.out.println("Pairs of elements in array are: ");
        pairs(a);
    }
}
