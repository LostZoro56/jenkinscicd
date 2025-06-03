import java.time.LocalDateTime;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("Hello, World! CI/CD pipeline is running...");
        greet("DevOps User");

        System.out.println("Number of arguments: " + args.length);
        System.out.println("Current date and time: " + LocalDateTime.now());

        farewell();
    }

    public static void greet(String name) {
        System.out.println("Greetings, " + name + "!");
    }

    public static void farewell() {
        System.out.println("Goodbye!");
    }
}