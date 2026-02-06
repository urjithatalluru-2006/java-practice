import java.util.Scanner;
public class EasyIfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        if (num > 10) {
            System.out.println("Number is greater than 10");
        } else {
            System.out.println("Number is 10 or less");
        }
        sc.close();
    }
}
