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
        final String PLUS = "+";
        final String MINUS = "-";
        final String MULTIPLICATION = "*";
        final String DIVISION = "/";
        final String MODULO = "%";

        switch (operation) {
            case PLUS:
                c = a + b;
                System.out.printf("%f %s %f = %f", a, operation, b, c);
                break;
            case MINUS:
                c = a - b;
                System.out.printf("%f %s %f = %f", a, operation, b, c);
                break;
            case MULTIPLICATION:
                c = a * b;
                System.out.printf("%f %s %f = %f", a, operation, b, c);
                break;
            case DIVISION:
                c = a / b;
                System.out.printf("%f %s %f = %f", a, operation, b, c);
                break;
            case MODULO:
                c = a % b;
                System.out.printf("%f %s %f = %f", a, operation, b, c);
                break;
            default:
                System.out.println("You input unsupported operation.");
        }
    }
}
