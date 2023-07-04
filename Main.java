class SimpleProgram {
    // Constructor with no parameters
    public SimpleProgram() {
        System.out.println("This is the default constructor.");
    }

    // Constructor with one parameter
    public SimpleProgram(String message) {
        System.out.println("Message from constructor: " + message);
    }

    // Method with no parameters
    public void printMessage() {
        System.out.println("This is a simple program.");
    }

    // Method with one parameter
    public void printMessage(String message) {
        System.out.println("Message from method: " + message);
    }
}

public class Main {
    public static void main(String[] args) {
        SimpleProgram program1 = new SimpleProgram(); // Using the no-parameter constructor
        program1.printMessage();

        SimpleProgram program2 = new SimpleProgram("Hello, world!"); // Using the constructor with one parameter
        program2.printMessage("Java is fun!");
    }
}
