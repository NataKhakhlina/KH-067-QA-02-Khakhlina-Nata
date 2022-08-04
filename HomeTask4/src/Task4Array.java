import java.util.Scanner;

public class Task4Array {
    public static void main(String[] args) {
        int filter = 0;

        System.out.print("Please input three words separated by the comma: ");
        Scanner scanner = new Scanner(System.in);
        String words = scanner.next();
        String[] wordsArray = words.split(",");

        do {
            System.out.println("Choose type of filter: ");
            System.out.println("1 - maximum length");
            System.out.println("2 - starts with");
            System.out.println("3 - ends with");
            System.out.println("4 - contains");
            System.out.println("0 - EXIT");
            filter = scanner.nextInt();


            switch (filter) {
                case 1:
                    System.out.print("Input maximum word length: ");
                    int maxLength = scanner.nextInt();
                    for (int i = 0; i < wordsArray.length; i++) {
                        String currentWord = wordsArray[i];
                        if (currentWord.length() <= maxLength) {
                            System.out.println(currentWord);
                        }
                    }
                    break;
                case 2:
                    System.out.print("Input begin of word: ");
                    String start = scanner.next();
                    for (int i = 0; i < wordsArray.length; i++) {
                        String currentWord = wordsArray[i];
                        if (currentWord.startsWith(start)) {
                            System.out.println(currentWord);
                        }
                    }
                    break;
                case 3:
                    System.out.print("Input end of word: ");
                    String end = scanner.next();
                    for (int i = 0; i < wordsArray.length; i++) {
                        String currentWord = wordsArray[i];
                        if (currentWord.endsWith(end)) {
                            System.out.println(currentWord);
                        }
                    }
                    break;
                case 4:
                    System.out.print("Input part of word: ");
                    String part = scanner.next();
                    for (int i = 0; i < wordsArray.length; i++) {
                        String currentWord = wordsArray[i];
                        if (currentWord.contains(part)) {
                            System.out.println(currentWord);
                        }
                    }
                    break;
                case 0:
                    System.out.println("Exit");
                    break;
                default:
                    System.out.println("Wrong choice, please input again.");
                    break;
            }
        }
        while (filter != 0) ;
    }
}
