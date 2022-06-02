import java.lang.*;
import java.util.*;

public class Test {
    public static void main(String[] args) {
        //System.out.println("Hello");
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        /*for(int i=1;i<=N;i++){
            for(int j=1;j<=N;j++){
                if(i==1 || j==1)
                    System.out.print("*");
                else{

                }
            }
        }*/
        for (int i = 1; i <= N; i++){
            if (i==1){
                for (int j = 1; j<=N; j++){
                    System.out.print(" * ");
                }
            }
            else{
                                for (int j = 1; j <= N+1-i;j++){
                    if(j==1 || j == (N+1-i)){
                        System.out.print(" * ");
                    }
                    else{
                        System.out.print(" - ");
                    }
                }
            }
            System.out.println();
        }
        
    }
}
