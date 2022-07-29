import java.util.Scanner;

public class CalculatorWithSwitch {
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
        switch (operation) {
            case "+":
                c = a + b;
                System.out.println("a + b = " + c);
                break;
            case "-":
                c = a - b;
                System.out.println("a - b = " + c);
                break;
            case "*":
                c = a * b;
                System.out.println("a * b = " + c);
                break;
            case "/":
                c = a / b;
                System.out.println("a / b = " + c);
                break;
            case "%":
                c = a % b;
                System.out.println("a % b = " + c);
                break;
            default:
                System.out.println("You input unsupported operation.");
        }
    }
}
