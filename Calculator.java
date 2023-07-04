public class Calculator {
    int i = 10;
    int k = 10;

    Calculator() {
        int result = 100;
        System.out.println("The result is: " + result);
        System.out.println("Invoke the add method");
    }

    public static void main(String[] args) {
        Calculator cl = new Calculator();
        System.out.println(cl.k);
        add();
    }

    public static void add() {
        int j = 20;
        int result = i + j;  // Error: non-static variable i cannot be referenced from a static context
        System.out.println(result);
    }
}
