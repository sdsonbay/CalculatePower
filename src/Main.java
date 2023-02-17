import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        int number, power;
        int result = 1;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number: ");
        number = scanner.nextInt();
        System.out.println("Enter the power: ");
        power = scanner.nextInt();

        for(int i = 0; i < power; i++){
            result *= number;
        }

        System.out.println(result);

    }
}
