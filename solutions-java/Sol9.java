import java.util.Scanner;
class Sol9{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i=1; i<=N; i++){
            System.out.print("*");
            for (int j=1; j <= i-1; j++){
                System.out.print("-");
        }
        System.out.println("*");
    }
    }
}