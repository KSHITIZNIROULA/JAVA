public class MethodOverloadingExample {

    public static void main(String[] args) {
        MethodOverloadingExample obj = new MethodOverloadingExample();

        obj.add(10, 20);
        obj.add(10, 20, 30);
        obj.add(10.5, 20.5);
    }

    // Method to add two integers
    public void add(int a, int b) {
        int sum = a + b;
        System.out.println("Sum of two integers: " + sum);
    }

    // Method to add three integers
    public void add(int a, int b, int c) {
        int sum = a + b + c;
        System.out.println("Sum of three integers: " + sum);
    }

    // Method to add two doubles
    public void add(double a, double b) {
        double sum = a + b;
        System.out.println("Sum of two doubles: " + sum);
    }
}
