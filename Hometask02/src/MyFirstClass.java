import java.util.Scanner;

public class MyFirstClass {
    public static void main(String[] args) {
        String name, address;
        System.out.println("What is your name?");
        Scanner sc = new Scanner(System.in);
        name = sc.nextLine();
        System.out.print("Where are you live, ");
        System.out.print(name);
        System.out.println("?");
        address = sc.nextLine();
        System.out.print(name);
        System.out.print(", ");
        System.out.println(address);
    }
}
