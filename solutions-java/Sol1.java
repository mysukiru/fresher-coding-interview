import java.util.Scanner; // Scanner is a standard Java Library to recieve input from command line
class Sol1{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // Create an instance of Scanner
        int number = sc.nextInt(); // nextInt is to read Integer type input
        while (number > 0){ 
            System.out.println(number % 10); // % operator returns remainder
            number = number/10; // / operator returns quotient
        }
        
    }
}