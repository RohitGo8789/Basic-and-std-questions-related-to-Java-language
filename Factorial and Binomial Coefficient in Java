//factorial and binomial coefficeint
public class Functions{
    public static int factorial(int n){
        int f = 1;
        for (int i = 1; i <= n; i++){
            f = f * i;
        }
        return f;
    }
    public static void main(String args[]){
        int n = 5;
        int r = 2;
        int n_fact = factorial(n);
        int r_fact = factorial(r);
        int nmr_fact = factorial(n-r);
        int bino = n_fact / (r_fact * nmr_fact);  
        System.out.println("Binomial coefficient is: " + bino);

    }
}
