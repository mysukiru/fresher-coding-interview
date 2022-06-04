import java.lang.*;
import java.util.*;

public class Test {
    static boolean isPrime(int N){
        boolean result = true;

        if (N==1){
            return false;
        }
        if (N==2){
            return true;
        }
        for (int i = 2; i<= N/2; i++){
            if (N % i == 0){
                result = false;
            }
        }

        return result;
    }
    public static void main(String[] args) {
        // YOUR CODE GOES HERE
        // Please take input and print output to standard input/output (stdin/stdout)
        // DO NOT USE ARGUMENTS FOR INPUTS
        // E.g. 'Scanner' for input & 'System.out' for output
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i =1; i <= N; i++ ){
            if (isPrime(i)){
                System.out.println(i);
            }
        }
        
    }
}