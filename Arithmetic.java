import java.util.Scanner;

public class Arithmetic {
    public static int sum (int a, int b){
        return a + b;
    } 
    public static int sub (int a, int b ){
        return a - b;
    }
    public static int mul (int a, int b ){
        return a * b;
    }
    public static int div (int a, int b ){
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new
    Scanner(System.in);
        System.out.println("Enter First Number: ");
            int num1 = scanner.nextInt();
        System.out.println("Enter Second Number: ");
            int num2 = scanner.nextInt();
                
    System.out.println("Addition: " + sum(num1 , num2));
    System.out.println("Difference:" + sub(num1, num2));
    System.out.println("Multiplication: " + mul(num1 , num2));
    System.out.println("Division: " + div(num1 , num2));

    scanner.close();
    }
}
