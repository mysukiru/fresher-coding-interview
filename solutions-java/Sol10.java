import java.lang.*;
import java.util.*;

public class Sol10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i ++){
            for (int j = 1; j <= N; j++){
                if (i+j <= N){
                System.out.print("-");
                }
                else{
                    System.out.print("*");
                }
            }
            System.out.println();    
        }
        
    }
}