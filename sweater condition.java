import java.util.Scanner;

public class SweaterCheck {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter temperature in °C: ");
        int temp = sc.nextInt();

        if (temp <= 10) {
            System.out.println("It is very cold. Wear a heavy sweater!");
        } 
        else if (temp <= 20) {
            System.out.println("It is a bit cold. You can wear a light sweater.");
        } 
        else {
            System.out.println("Weather is warm. No sweater needed.");
        }

        sc.close();
    }
}
