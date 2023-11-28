import java.util.Scanner;

public class PrintInteger {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int integer = scanner.nextInt();
        System.out.println("The integer you entered is: " + integer);
    }
}