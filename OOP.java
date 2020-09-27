
// import java.util.Scanner;
// import mypack.*;
// import mypack.oopPackage.Car;
// // import mypack.oopPackage.Honda;
// // import mypack.oopPackage.Toyota;

// import mypack.oopPackage;
// import mypack.oopPackage.*;
// import mypack.subpack.*;
import java.time.*;
import java.time.format.DateTimeFormatter;

public class OOP {
    public static void main(String[] args) {
        // Scanner input = new Scanner(System.in);
        // System.out.print("Input your name: ");
        // String name = input.nextLine();
        // System.out.println("Hello world, " + name + ".");
        // input.close();
        // oopPackage.Car car1 = new oopPackage.Car("Aston Martin", "DB11", "England");
        // oopPackage.Car car2 = new oopPackage.Car("Toyota", "Fortuner", "Japan");
        // car1.greeting();
        // car1.model = "DB9";
        // car1.greeting();
        // car1.nation = "Spain"; // Cannot modify nation value becase it was set to constant by using 'final' keyword
        // car2.greeting();
        // car2.model = "Camry";
        // car2.greeting();
        // oopPackage.Car h1 = new Honda("Honda", "Civic", "Japan", 1000000);
        // Car t1 = new Toyota("Toyota", "Camry", "japan", 1800000);
        // Car car1 = new Honda("AstonMartin", "DB11", "England", 10);
        // Honda h2 = new Honda("Honda", "Civic", "City", 1000000);

        // h1.greeting();
        // h2.greeting();
        // t1.greeting();
        // car1.greeting();

        // ----- Modifiers
        // Bmw bmw1 = new Bmw();
        // bmw1.startEngine();
        // bmw1.topSpeedCalculation();

        // Book book1 = new Book();
        // book1.setBookName("Java Tutorial");
        // book1.setAuthorName("Chondan Susuwan");
        // System.out.println("Hello, My name is " + book1.getAuthorName() + ". I wrote " + book1.getBookName() + ".");

        // ----- Import packages example
        // System.out.println(subpackage.message); 

        // Car honda1 = new Honda("Honda", "Civic", "Japan", 12231);
        // honda1.greeting();

        // ----- Inheritances
        // Animal animal1 = new Animal();
        // Animal animal2 = new Chicken();
        // Animal animal3 = new Dog();
        // Cannot access sound of those object above
        // Chicken chicken1 = new Chicken();
        // chicken1.sound();

        // ----- Inner Classes
        // oopPackage oop = new oopPackage();
        // oopPackage.OuterClass out1 = oop.new OuterClass();
        // oopPackage.OuterClass.InnerClass inner1 = out1.new InnerClass();
        // System.out.println("The sum is " + inner1.sum());
        
        // -- Private Inner Classes
        // oopPackage oop2 = new oopPackage();
        // oopPackage.Out out2 = oop2.new Out("Chondan");
        // out2.intro();

        // -- Static Inner Classes
        // AnotherOut out3 = new AnotherOut();
        // AnotherOut.AnotherIn inner = new AnotherOut.AnotherIn();
        // System.out.println(out3.x);
        // System.out.println(inner.msg);
        
        // ----- Abstaction
        // Parrot parrot = new Parrot();
        // parrot.birdSound();

        // Samsung samsungGalaxyS9 = new Samsung();
        // samsungGalaxyS9.start();
        // samsungGalaxyS9.install("Instagram");
        // samsungGalaxyS9.reStart();
        // samsungGalaxyS9.shutDown();

        // class Apple implements PhoneMethod {
        //     public void start() {
        //         System.out.println("Apple start");
        //     }
        //     public void reStart() {
        //         System.out.println("Samsung restart");
                
        //     }
        //     public void shutDown() {
        //         System.out.println("Samsung shutdown");
        //     }
        // }
        // Apple iPhonex = new Apple();
        // iPhonex.start();

        // ----- Enum
        // Level myLevel = Level.MEDIUM;
        // System.out.println(myLevel);

        // Enum in switch statement
        // switch (myLevel) {
        //     case LOW:
        //         System.out.println("Low level");
        //         break;
        //     case MEDIUM:
        //         System.out.println("Medium level");
        //         break;
        //     default:
        //         System.out.println("High level");
        // }

        // Loop Through an Enum
        // for (Level x : Level.values()) {
        //     System.out.println(x);
        // }

        // Enum implement interfaces
        // System.out.println(Level.sport);
        // Level.greeting();
        // Level x = Level.MEDIUM;
        // x.boxing();
        // String name = Input.inputString("name");
        // System.out.println("Hello, My name is " + name);
        // int age = Input.inputInterger("age");
        // System.out.println("I am " + age + " years old.");
        // int x = Input.inputInterger("x");
        // System.out.println("X is " + x);
        // Input.close();

        // ----- Java Date and Time
        // Java does not have a built-in Date class, but we can import the java.time package to work with the date and time API.
        // --- Display current date
        LocalDate date = LocalDate.now();
        System.out.println("Today is " + date);
        // --- Display current time
        LocalTime time = LocalTime.now();
        System.out.println("The time now is " + time);
        // --- Display current date and time
        LocalDateTime dateTime = LocalDateTime.now();
        System.out.println("Now is " + dateTime);
        // --- Formatting Date and Time
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/mm/yyyy hh-mm-ss");
        String formatDate = dateTime.format(format);
        System.out.println("Now is " + formatDate);
    } 
}