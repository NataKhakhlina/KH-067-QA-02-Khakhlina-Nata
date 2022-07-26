import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        System.out.println("Hello! \nThis is your Calculator.");
        System.out.print("Please input the first value a = ");
        Scanner scanner = new Scanner(System.in);
        double a = scanner.nextDouble();
        System.out.print("Please input operation from the list (+, -, *, /, %) = ");
        String operation = scanner.next();
        System.out.print("Please input the second value b = ");
        double b = scanner.nextDouble();
        double c;
        if (operation.equals("+")){
            c = a + b;
            System.out.println("a + b = " + c);
        }
        else if (operation.equals("-")){
            c = a - b;
            System.out.println("a - b = " + c);
        }
        else if (operation.equals("*")){
            c = a * b;
            System.out.println("a * b = " + c);
        }
        else if (operation.equals("/")){
            c = a / b;
            System.out.println("a / b = " + c);
        }
        else if (operation.equals("%")){
            c = a % b;
            System.out.println("a % b = " + c);
        }
        else {
            System.out.println("You input unsupported operation.");
        }
    }
}
