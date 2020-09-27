package mypack;
import java.util.Scanner;


public class oopPackage {
    public static class Car {
        public String brand, model;
        public final String nation;
        public Car(String brand, String model, String nation) {
            this.brand = brand;
            this.model = model;
            this.nation = nation;
        }
        public void greeting() {
            System.out.println("Hello, I am " + brand + " " + model + ". I come from " + nation + ".");
        }
        protected void test() {
            System.out.println("hello " + x);
        }
        private String x = "Mate!!";
        // Java Class Attributes
        // The class attributes are variables within a class
    }
    public static class Honda extends Car {
        public int price;
        public Honda(String brand, String model, String nation, int price) {
            super(brand, model, nation);
            this.price = price;
        }
        @Override
        public void greeting() {
            // super.greeting(); // call parent method
            System.out.println("I am Honda.");
            super.test();
        }
        
    
    
        
    }
    public static class Toyota extends Car {
        public int price;
        public Toyota(String brand, String model, String nation, int price) {
            super(brand, model, nation);
            this.price = price;
        }
        public void hello() {
            System.out.println("Hello");
        }
        
    }
    // ----- Access Modifiers
    // --- For class
    // - defautl -> The calss is only accessible by classes in the same package.
    // --- For attributes, methods and constructors
    // - public, private, protected and default
    
    
    // ----- Non-Access Modifiers
    // -- For class
    // - final -> The class cannot be inherited by other classes.
    // - abstract -> The class cannot be used to create objects (To access an abstract class, it must be inherited from another class)
    // --- For attributes, methods and constructors
    static abstract class Drive {
        public String startMsg = "Press red button to start engine.";
        public final int releaseYear = 2020;
        public abstract void topSpeedCalculation();
        public abstract void safetySystem();
    }
    public static class Bmw extends Drive {
        public void startEngine() {
            System.out.println(super.startMsg);
        }
        public void topSpeedCalculation() {
            System.out.println("The top speed is " + 200);
        }
        public void safetySystem() {
            System.out.println("Our safety systems meet the standard");
        }
    }
    // ----- Java Encapsulation
    // The meaning of Encapsulation, is to make sure that "sensitive" data is hidden from users.
    public static class Book {
        private String bookName;
        private String authorName;

        public String getBookName() {
            return this.bookName;
        }
        public void setBookName(String setName) {
            this.bookName = setName;
        }
        public String getAuthorName() {
            return this.authorName;
        }
        public void setAuthorName(String setName) {
            this.authorName = setName;
        }
        
    }
    // ----- Java Packages & API
    // A package in Java is used to group related classes. Think of it as a folder in a file directory. 
    // We use packages to avoid name conflicts, and to write a better maintainable code. Packages are divided into two categories.
    // 1. Built-in Packages (packages from the java API) 2. User-defined packages (create your own packages)
    // --- Built-in Packages
    // The java API is a library of prewritten classes, that are free to use, include in the Java Development Environment

    // ---- Java Inheritance
    // In Java, it is possible to inherit attributes and methods from one class to another. 
    // We group the "inheritance concept" into two categories
    // 1. subclass (child) - the class that inherits from another class
    // 2. superclass (parent) - the class being inherited from

    // ------ Java Polymorphism 
    // Polymorphism means "many forms", and it occurs when we have many classes that are related to each other by inheritace
    // Inheritances lets us inherit attributes and methods from another class. Polymorphism  uses those methods to perform different tasks.
    public static class Animal {
        protected void sound() {
            System.out.println("Animal sounds!!");
        }
    }
    public static class Chicken extends Animal {
        @Override
        public void sound() {
            super.sound();
            System.out.println("Chicken sounds!!");
        }
    }
    public static class Dog extends Animal {
        public void sound() {
            System.out.println("Dog sounds!!");
        }
    }
    // ----- Java Inner Classes
    // In Java, it is also possible to nest classes (a class within a class).
    // The purpose of nested classes it to group classes that belong together, which makes your code more readable and maintainable
    public class OuterClass {
        public int x = 10;
        public class InnerClass {
            public int y = 20;
            public int sum() {
                return x + y;
            }
        } 
    }
    // -- Private Inner Class 
    // Unlike a 'regular' class, an inner class can be private or protected. If you don't want outside objects to access the inner class, declare the class as private.
    public class Out {
        public String name;
        public Out(String name) {
            this.name = name;
        }
        private class In {
            public int age = 22;

        }
        public void intro() {
            In in = new In();
            System.out.println("Hello, My name is " + name + ". I am " + in.age + " years old.");
        }
    }

    // -- Static Inner Class
    public static class AnotherOut {
        public int x = 2;
        public static class AnotherIn {
            public String msg = "Hello, I am Static Inner Class";
        }
    }

    // ----- Abstraction
    // --- Java Abstract Classes and Methods
    // Data abstraction is the  process of hiding certain details and showing only essential information to the user.
    // Abstraction can be achieved with either abstract classes or interfaces.
    // 1. Abstract class is a restricted  class that cannot be used to create objects.
    // 2. Abstract method can only be used in an abstract class, and it doess not have a body.

    public static abstract class Bird {
        public abstract void birdSound();
        public void sleep() {
            System.out.println("Zzz");
        }
    }
    public static class Parrot extends Bird {
        public void birdSound() {
            System.out.println("Hello, I am parrot.");
        }
    }

    // ----- Interfaces
    // An interfaces is a completely 'abstract class' that is used to group related methods with empty bodies.
    // Interface methods are by default abstract and public
    // Interface attributes are by default public, static and final.
    public interface PhoneMethod {
        public void start();
        public void reStart();
        public void shutDown();
    }
    public interface Application {
        public void install(String app);
    }
    // Multiple interfaces
    public static class Samsung implements  PhoneMethod, Application {
        public void start() {
            System.out.println("Samsung start");
        }
        public void reStart() {
            System.out.println("Samsung restart");
            
        }
        public void shutDown() {
            System.out.println("Samsung shutdown");
        }
        public void install(String app) {
            System.out.println(app + " was installed.");
        }
    }
    // ----- Enums 
    // An enum is a special 'class' that represents a group of constans variables
    // Enum is short for "enumerations", which means "specifically listed"
    public interface Boxing {
        public String sport = "boxing";
        public void boxing();
    }
    public static enum Level implements Boxing {
        LOW, MEDIUM, HIGH;
        // Difference between Enums and Classes
        // An enum can, just like a class, have attributes and methods. The only difference is that enum constants are public, static and final
        public static void greeting() {
            System.out.println("Hello, I am an Enum level.");
        
        }
        // An enum cannot be used to create objects, and it cannot extend other classes (but it can implement interfaces)
        
        public void boxing() {
            System.out.println("Hello, Do you love boxing?" + " My level is " + super.name());
            this.boxing();
        }
        // public static void boxing() {
        //     System.out.println("Hi, Do you love boxing?");
        // }

        
    }
    //  ----- Java User Input
    public static class Input {
        private static Scanner input = new Scanner(System.in);
        public static void close() {
            input.close();
        }
        public static String inputString(String data) {
            System.out.print("Input " + data + ": ");
            String x = input.nextLine();
            return x;
        }
        public static int inputInterger(String data) {
            System.out.print("Input " + data + ": ");
            int x = input.nextInt(); 
            return x;
        }
    }

    // ----- Java Date and Time
    // Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.
    
    
}
        
        