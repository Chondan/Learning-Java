import java.util.ArrayList;
import java.util.function.Consumer;
import mypack.oopPackage.Input;

public class Lambda {
    public static void main(String[] args) {
        // ----- Java Lambda Expression
        // Lambda Expressions is a short block of code which takes in parameters and returns a value.
        // Lambda expressions are similar to methods, but they do not need a name and they can be implemented right in the body of a method

        ArrayList<Integer>  numbers = new ArrayList<Integer>();
        numbers.add(12);
        numbers.add(4);
        numbers.add(9);
        numbers.add(22);
        numbers.forEach(n -> {System.out.println(n*n);});
        Consumer<Integer> method = (n) -> {
            n *= n;
            System.out.println(n);
        };
        numbers.forEach(method);

        // To use a lambda expression in a method, the method should have a parameter with a single-method interface as its type.
        // Calling the interface's method will run the lambda expression

        StringFunction askForHelp = (name, phrase) -> {
            return name + ", " + phrase;
        };
        StringFunction sayHi = (name, phrase) -> {
            return name + ", " + phrase;
        };
        printFormatted("Chondan", "How are you doing?", sayHi);
        printFormatted("Gerrard", "Can you do me a favor?", askForHelp);
        
        Employee manager = () -> {
            String name = Input.inputString("Name");
            System.out.println("Hello, My name is " + name + ". I am a manager.");
        };

        manager.setup();
        greeting("Good morning everyone.", manager);


    }
    interface StringFunction {
        String run(String name, String question);
    }
    public static void printFormatted(String name, String phrase, StringFunction format) {
        String result = "Hello " +  format.run(name, phrase);
        System.out.println(result);
    }

    public static void greeting(String string, Employee emp) {
        System.out.print(string);
        emp.setup();
    }

    interface Employee {
        void setup();
    }


    
}