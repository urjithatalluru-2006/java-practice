day8.javaimport java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a number (1-3): ");
        int num = sc.nextInt();

        switch (num) {
            case 1:
                System.out.println("You selected One");
                break;

            case 2:
                System.out.println("You selected Two");
                break;

            case 3:
                System.out.println("You selected Three");
                break;

            default:
                System.out.println("Invalid number");
        }

        sc.close();
    }
}
