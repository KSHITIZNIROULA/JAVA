public class ExceptionHandlingExample {

    public static void main(String[] args) {
        int dividend = 10;
        int divisor = 0;

        try {
            int result = divideNumbers(dividend, divisor);
            System.out.println("The result of the division is: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } catch (Exception e) {
            System.out.println("An error occurred: " + e); // Exception message is implicitly converted to a string
        }
    }

    public static int divideNumbers(int dividend, int divisor) {
        return dividend / divisor;
    }
}
