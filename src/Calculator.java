import java.util.Scanner;

public class Calculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        System.out.println("Choose an operation: ");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        System.out.println("5. Decimal Remainder");
        System.out.println("6. Square");
        System.out.println("7. Square Root");
        System.out.println("8. Exponentiation");

        int choice = scanner.nextInt();

        double result = 0;

        switch (choice) {
            case 1:
                result = add(number1, number2);
                break;
            case 2:
                result = subtract(number1, number2);
                break;
            case 3:
                result = multiply(number1, number2);
                break;
            case 4:
                result = divide(number1, number2);
                break;
            case 5:
                result = getDecimalRemainder(number1);
                break;
            case 6:
                result = square(number1);
                break;
            case 7:
                result = squareRoot(number1);
                break;
            case 8:
                result = exponentiation(number1, number2);
                break;
            default:
                System.out.println("Invalid choice.");
                return;
        }

        System.out.println("Result: " + result);
    }

    public static double add(double number1, double number2) {
        return number1 + number2;
    }

    public static double subtract(double number1, double number2) {
        return number1 - number2;
    }

    public static double multiply(double number1, double number2) {
        return number1 * number2;
    }

    public static double divide(double number1, double number2) {
        if (number2 != 0) {
            return number1 / number2;
        } else {
            System.out.println("Error: Division by zero.");
            return 0;
        }
    }

    public static double getDecimalRemainder(double number) {
        return number % 1;
    }

    public static double square(double number) {
        return number * number;
    }

    public static double squareRoot(double number) {
        return Math.sqrt(number);
    }

    public static double exponentiation(double base, double exponent) {
        return Math.pow(base, exponent);
    }
}
