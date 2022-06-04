import java.util.Scanner;
public class Sol5 {

    static boolean isPrime(int A){
        boolean result = false;
        if (A==1){
            return false;
        }
        if (A==2){
            return true;
        }
        for (int i = 2; i <= A-1; i++){
            if (A % i == 0){
                result= false;
            }
            else{
                result= true;
            }
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        System.out.println(isPrime(N));
        
    }
    
}
