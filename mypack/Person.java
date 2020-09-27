package mypack;

public class Person {
    private String name;
    public Person(String name) {
        this.name = name.toUpperCase();
    }
    public String getName() {
        return name;
    }
    public void greeting() {
        System.out.println("Hello, My name is " + name + ".");
    }
    public void greeting(String msg) {
        System.out.println(msg + " Mr/Mrs. " + name);
    }
    public Person nextPerson;
    // ----- Java Method Overloading
    // With method overloading, multiple methods can have the same name with different parameters
    public void bye(String name, String byeMsg) {
        System.out.println(byeMsg + " " + name);
    }
    public void bye(String name) {
        bye(name, "Adios!");
    }
    // Instead of defining two methods that should do the same thing, it is better to overload one.
    public static class mathOperation {
        public static int plusInterger(int a, int b) {
            return a + b;
        }
        public static double plusDouble(Double a, Double b) {
            return a + b;
        }
    }
    // Java Scope (Method Scope)
    // Variables declared directly inside a method are available anywhere in the method following the line of code in which they were declred
    // -- Block Scope
    // A block of code refers to all of the code between curly braces {}.
    
    
}

