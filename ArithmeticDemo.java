public class ArithmeticDemo {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        double num3 = 3.0;

        int sum = num1 + num2;
        int difference = num1 - num2;
        int product = num1 * num2;
        double quotient = (double) num1 / num2; // Cast to double for accurate division
        int remainder = num1 % num2;

        double expressionResult = num1 + num2 * 2 - (num1 / num3); // Changed to double

        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + difference);
        System.out.println("Product: " + product);
        System.out.println("Quotient: " + quotient);
        System.out.println("Remainder: " + remainder);
        System.out.println("Expression Result: " + expressionResult);
    }
}

