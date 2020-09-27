// import java.io.Console;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.time.LocalDate;
import mypack.*;
// import org.json.simple.JSONArryay;
// import org.json.simple.parser.*;
// import org.json.*;

public class Program {
    public static void variables() {
        // ----- Variables
        String fname = "Chondan";
        String lname = "Susuwan";
        int age = 22;
        System.out.println(fname + " " + lname + ", I am " + age + " years old");
        // -- final -> you can add the final keyword if you don't want others (or yourself) to overwrite existing values
        // (this will declare the variable as 'final' or 'constant', which means unchangeble and read-only)
        final int constantValue = 12;
        System.out.println("Constant value is " + constantValue);
    }
    public static void javaDataTypes() {
        // The byte data type can store whole numbers from -128 to 127. This can be used instead of int or other integer types to save memory 
        // when you are certain that the value will be within -128 and 127
        byte smallNum = 125;
        System.out.println("The small number is " + smallNum);
        int money = (int) 3e4;
        System.out.println("I have " + money + " THB");
    }
    public static void javaTypeCasting() {
        // Type casting is when you assign a value of one primitive data type to another type
        // In Java, there are two types of casting -> Widening Casting (automatically: small to large), Narrowing Casting (manually: large to small)
        // -- Widening Casting
        int myInt = 20;
        double myDouble = myInt;
        System.out.println("The integer is " + myInt);
        System.out.println("The double is " + myDouble);
        // -- Narrowing Casting
        double myDouble2 = 25.5;
        int myInt2 = (int) myDouble2;
        System.out.println("The integer is " + myInt2);
        System.out.println("The double is " + myDouble2);
    }
    public static void javaOperators() {
        // Java Operators
        // Operators are used to perform operations on variables and values
        int sum = 10 + 19;
        System.out.println("The sum is " + sum);
    }
    public static void javaStrings() {
        // Strings are used for storing text.
        String greeting = "Hello, I am Chondan Susuwan";
        String alphabet = "abcdefghijklmnopqrstuvwxyz";
        System.out.println(greeting);
        System.out.println("There are " + alphabet.length() + " alphabet in english.");
        String upperAlphabet = alphabet.toUpperCase();
        System.out.println("The alphabets are " + upperAlphabet);
        // Finding a Character in a String
        String txt = "Please locate when 'locate' occurs!";
        System.out.println("The locate of 'locate' is at index of " + txt.indexOf("locate"));
        String fname = "Chondan ";
        String lname = "Susuwan";
        System.out.println("My name is " + fname.concat(lname));
    }
    public static void javaMath() {
        System.out.println("The maximum number between is 10 and 55 is" + Math.max(10, 55));
        // Random Numbers -> Math.random() returns a random number between 0.0 (inclusive), and 1.0 (exclusive)
        double random1 = Math.random();
        double random2 = Math.random() * 101;
        DecimalFormat twoPlaceFormat = new DecimalFormat("#0.000");
        String random1String = twoPlaceFormat.format(random1);
        String random2String = twoPlaceFormat.format(random2);
        System.out.println("The random number between 0 and 1 is " + random1String);
        System.out.println("The random number between 0 and 100 is " + random2String);
    } 
    // check prime number
    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i < n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;

    }
    public static void javaBooleans() {
        System.out.println(isPrime(25));
        System.out.println(isPrime(3));
        System.out.println(isPrime(2));
    }
    public static void ifElse() {
        Scanner input = new Scanner(System.in);
        System.out.print("Input your age: ");
        int age = input.nextInt();
        input.close();
        if (age < 18) {
            System.out.println("Cannot access, You are too young!");
        } else {
            System.out.println("Can access, You are old enough");
        }
        String msg = (age < 18) ? "You can not." : "You can";
        System.out.println("Hello, I am ternary operator. " + msg);
    }
    public enum Day {
        Mon, Tue, Wed, Thu, Fri, Sat, Sun;
        private static Day[] dayList = Day.values();
        public static Day getDay(int index) {
            return dayList[index - 1];
        }
    }
    public static void javaSwitch() {
        Scanner input = new Scanner(System.in);
        int day;
        do {
            System.out.print("Input index of day: ");
            day = input.nextInt();
        } while (day > 7 || day <= 0);
        input.close();
        Day dayName = Day.values()[day - 1];
        switch (day) {
            case 6:
            case 7: 
                System.out.println(dayName + " is Weekends");
                break;
            default:
                System.out.println(dayName + " is Weekdays");
                break;
        }   
    }
    public static void javaWhileLoop() {
        // Print out the star
        System.out.print("Input base number: ");
        Scanner input = new Scanner(System.in);
        int base = input.nextInt();
        input.close();
        int start = 1;
        while (start <= base) {
            for (int i = 1; i <= start; i++) {
                System.out.print("*");
            }
            System.out.print("\n");
            start++;
        }
    }
    public static void javaForLoop() {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();
        // -- For-Each Loop
        String[] cars = {"Volvo", "Aston Martin", "BMW"};
        for (String individualCar : cars) {
            System.out.print(individualCar + " ");
        }
        System.out.println(); 
    }
    public static void javaArrays() {
        int[] numbers = {1, 2, 3, 4, 5, 6};
        System.out.println("The first number in array is " + numbers[0]);
        int temp = numbers[numbers.length - 1];
        int lastnum = numbers[numbers.length - 1] = 10;
        System.out.println("The last number in array was changed from " + temp + " to " + lastnum);
        // -- Multidimensional Arrays
        // A multidimensional array is an array containing one or more arrays
        int[][] myNumbers = { {1, 3, 5, 7, 9}, {2, 4, 6, 8} };
        String txt = "";
        for (int[] num : myNumbers) {
            for (int evenNum : num) {
                if (evenNum % 2 == 0) {
                    txt += evenNum + " ";
                }
            }
        }
        System.out.print("All of even in myNumbers is " + txt + "\n");
        
        
    }


    public static void main(String[] args) {
        System.out.println("Hello world");
        LocalDate date1 = LocalDate.now();
        System.out.println("Today is " + date1.toString());
        MyPackage.hello();
        // What is Java?
        // Java is a popular programming language, created in 1995.
        // Why use Java?
        // Java works on different platforms (Windows, Mac, Linux, Raspberry Pi, etc.)

        // ----- Variables
        // variables();

        // ----- Data Types
        // javaDataTypes();

        // ----- JavaTypeCasting
        // javaTypeCasting();

        // ----- Operators
        // javaOperators();

        // ----- Strings 
        // javaStrings();

        // ----- Maths
        // javaMath();

        // ----- Booleans
        // javaBooleans();

        // ----- if...else
        // ifElse();

        // ----- Switch
        // javaSwitch();

        // ----- While Loop
        // javaWhileLoop();

        // ----- For Loop 
        // javaForLoop();

        // ----- Arrays
        // javaArrays();

        // ------------- Data Structure (linkedlist) ----------------------
        // LinkList list1 = new LinkList();
        // list1.insert(5);
        // System.out.println("Head node's value is " + list1.head.data);
        // list1.insert(2);
        // list1.insert(10);
        // list1.insert(30);
        // System.out.println("Total nodes is " + list1.totalNode());
        // System.out.println("Node1's value is " + list1.getData(0));
        // System.out.println(list1.totalNodeNumber);
        // list1.deleteNode(0);
        // System.out.println("Node1's value is " + list1.getData(0));
        // System.out.println("Node2's value is " + list1.getData(1));
        // System.out.println("Node3's value is " + list1.getData(2));
        // Node n = list1.getNodeFromIndex(0, "exactly");
        // System.out.println(n.data);
        // Node node10 = new Node(55);
        // list1.insertNodeAt(node10, 0);
        // System.out.println("Total nodes is " + list1.totalNode());
        // System.out.println("The new node value at index 0 is " + list1.getData(0));
        // System.out.println("The new node value at index 1 is " + list1.getData(1));
        // System.out.println("The new node value at index 2 is " + list1.getData(2));
        // System.out.println("The new node value at index 3 is " + list1.getData(3));
        // list1.insertDataAt(0, 100);
        // System.out.println("Total nodes is " + list1.totalNode());
        // System.out.println("The new node value at index 0 is " + list1.getData(0));
        // System.out.println("Total nodes is " + list1.totalNode());
        // System.out.println("The new node value at index 0 is " + list1.getData(0));
        // System.out.println("The new node value at index 1 is " + list1.getData(1));
        // System.out.println("The new node value at index 2 is " + list1.getData(2));
        // System.out.println("The new node value at index 3 is " + list1.getData(3));
        // System.out.println("The new node value at index 4 is " + list1.getData(4));
        // System.out.println("The last node value is " + list1.getData(list1.totalNodeNumber - 1));
        // list1.deleteNode(list1.totalNodeNumber - 1);
        // System.out.println("Total nodes is " + list1.totalNode());
        // System.out.println("The last node value is " + list1.getData(list1.totalNodeNumber - 1));
        
        // ------------------------ Method ----------------------
        Person person1 = new Person("chondan susuwan");
        Person person2 = new Person("steven gerrard");
        person1.nextPerson = person2;
        System.out.println(person1.nextPerson);
        person1.nextPerson = person2;
        person1.nextPerson.greeting();
        System.out.println("Person1's name is " + person1.getName());
        person1.greeting();
        person2.greeting();
        person1.bye("Chondan");

        System.out.println("The sum of 2 and 20 is " + Person.mathOperation.plusInterger(2, 20));
        {
            String test = "test";
            System.out.println(test);
        }
        // System.out.println(test); // cannot use variable test outside of block scope
        int sumUntilFive = Recursion.sumFormZeroToN(5);
        System.out.println("The sum from 0 to 5 is " + sumUntilFive);
        int sumUntilTwo = Recursion.sumFormZeroToN(2);
        System.out.println("The sum from 0 to 2 is " + sumUntilTwo);
        System.out.println("The sum from 0 to 0 is " + Recursion.sumFormZeroToN(0));
        System.out.println("The sum between 5 and 10 is " + Recursion.sumBetween(5, 10));
        System.out.println("The sum between -10 and -5 is " + Recursion.sumBetween(-10, -5));
        System.out.println("The sum between 0 and 10 is " + Recursion.sumBetween(0, 10));

    }
}
