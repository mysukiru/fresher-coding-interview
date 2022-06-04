import java.util.Scanner;
public class Sol4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int first = 0;
        int last = 0;
        last = number % 10;
        while (number > 0){
            first = number % 10;
            number = number/10;
        }
        System.out.print(first);
        System.out.print(" ");
        System.out.println(last);
    }
}
