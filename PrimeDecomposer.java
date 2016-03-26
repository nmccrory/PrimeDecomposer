package primedecomposer;

/**
 *
 * @author Nick
 */
import java.util.Scanner;
public class PrimeDecomposer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividend;
        int i=1;
        int quotient;
        int divisor=2;
        int x =0;
        int n;
        int[] factors;
        
        System.out.print("Enter an integer to be decomposed as a product of primes -> ");
        dividend = input.nextInt();
        
        if(dividend < 2){
            System.out.printf("%nThe prime factorization for integers less than 2 cannot be determined.%n");
        }else{
            System.out.printf("%n%-10s %-10s %-10s %-10s", "divisor", "dividend", "quotient", "factor");
            System.out.printf("%n================================================");

            while(divisor <= dividend){
                if(dividend%divisor == 0){
                    System.out.printf("%np{%d}", divisor);
                    quotient = dividend/divisor;
                    dividend = quotient;
                    i++;
                }else{
                    quotient = dividend/divisor;
                    divisor++;
                }
                factors[x] = divisor;
                x++;
                System.out.printf("%-10d %-10d %-10d %-10d", divisor, dividend, quotient, divisor);
            }
            for(n=0;n<factors.length;n++){
                System.out.printf(" %d ", factors[n]);
            }
        }
    }
    
}
