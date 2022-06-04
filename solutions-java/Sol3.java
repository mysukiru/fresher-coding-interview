import java.util.Scanner;

import javax.lang.model.element.Element;
class Sol3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number = sc.nextInt();
        int result = 0;
        int temp = number;
        while (temp > 0){
            result = result * 10 + temp % 10;
            temp = temp/10;
        }
        if (result == number){
            System.out.println("A palindrome");
            //System.out.println(result);
        }
        else{
            System.out.println("Not a palindrome");
        }
        
    }
}