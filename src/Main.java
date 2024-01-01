import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double n1, n2, result;
        int select;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter the first number: ");
        n1 = input.nextDouble();

        System.out.print("Please enter the second number: ");
        n2 = input.nextDouble();

        System.out.println("1) Addition \n2) Subtraction\n3) Multiplication \n4) Division");
        System.out.println("Please select the operation: ");
        select = input.nextInt();

        switch (select) {
            case 1: result = (n1 + n2);
            break;
            case 2: result = (n1 - n2);
            break;
            case 3: result = (n1 * n2);
            break;
            case 4:
                if (n2 != 0) {// Division by zero check added.
                    result = (n1 / n2);
                } else {
                    System.out.println("Error: Division by zero is not allowed!");
                    return; // The "return;" statement ends the method right here.
                }
            break;
            default:
                System.out.println("Invalid operation selected!");
                return;
        }
        System.out.println("Result: " + result);
    }
}