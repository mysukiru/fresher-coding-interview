import java.lang.*;
import java.util.*;
public class Sol11 {
        public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++){
            for (int j = 1; j <= N*2; j++){
                if (j <= N){
                    if(i+j > N+1){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
                else{
                    if(j-i < N){
                        System.out.print(" ");
                    }
                    else{
                        System.out.print("*");
                    }
                }
            }
            System.out.println();
        }
    }
}
    
