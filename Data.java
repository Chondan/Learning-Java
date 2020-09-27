import java.util.*;
// import mypack.*;
import mypack.oopPackage.Car;
import mypack.oopPackage.Input;

public class Data {
    public static class LearnArraylist {
        public static void run() {
            // ----- Java ArrayList
            // The ArrayList class is a resizable array, which can be found in the java.util
            // package
            // The difference between a built-in array and an ArrayList in Java,
            // is that the size of an array cannot be modified (if you want to add or remove
            // elements to/from an array, you have to creat a new one)
            // While elements can be added and remove from an ArrayList whenever you want
            ArrayList<String> cars = new ArrayList<String>();
            // --- Add Items
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Aston Martin");
            System.out.println(cars);

            // --- Access an Item
            // String car1 = cars.get(2);
            // System.out.println(car1);

            // --- Change an Item
            // cars.set(0, "Mercedes Benz");
            // System.out.println(cars.get(0));

            // --- Remove an Item
            // cars.remove(0);
            // System.out.println(cars);
            // To remove all the elements in the ArrrayList, use the clear() method
            // cars.clear();
            // System.out.println(cars);

            // --- ArrayList Size
            // System.out.println("Car size is " + cars.size());
            // - foreach loop
            // for (String car: cars) {
            // System.out.println(car);
            // }

            // --- Loop Through an ArrayList
            // for (int i = 0; i < cars.size(); i++) {
            // System.out.println(cars.get(i));
            // }

            // --- Other type
            ArrayList<Car> Garage = new ArrayList<Car>();
            Car c = new Car("Honda", "Civic", "Japan");
            Car c2 = new Car("Toyota", "Camry", "Japan");
            Car c3 = new Car("Aston Martin", "DB11", "England");
            Garage.add(c);
            Garage.add(c2);
            Garage.add(c3);
            // Garage.get(0).greeting();
            // System.out.println(Garage.get(0).brand);
            showGarage(Garage);

            // --- foreach loop throgh class car
            for (Car car : Garage) {
                car.greeting();
            }

            // --- Sort an ArrayList
            Collections.sort(cars);
            System.out.println(cars);
        }

        private static void showGarage(ArrayList<Car> x) {
            String txt = "";
            if (x.size() != 0) {
                for (int i = 0; i < x.size(); i++) {
                    txt += x.get(i).brand + " " + x.get(i).model + ", ";
                }
                txt = txt.substring(0, txt.length() - 2);
            }
            System.out.println("[" + txt + "]");

        }
    }

    public static void learnLinkedList() {
        // ----- LinkedList
        // The LinkedList class is almost identical to the ArrayList
        LinkedList<String> garage = new LinkedList<String>();
        garage.add("Volvo");
        garage.add("BMW");
        garage.add("Ford");
        garage.add("Mazda");
        System.out.println(garage);
        garage.add(1, "Toyota");
        System.out.println(garage);

        // --- ArrayList vs LinkedList
        // The LinkedList class is almost identical to the ArrayList
        // The LinkedList class is a collection which can contain many objects of the
        // same type, just like the ArrayList
        // The LinkedList class has all of the same methods as the ArrayList class
        // because they both implement the List interface.
        // However, while the ArrayList class and LinkeList class can be used in the
        // same way, there are built very differently.

        // How the ArrayList works
        // The ArrayList class has a regular array inside it. When an element is added,
        // it is placed into the array.
        // If the array is not big enough, a new, larger array is created to replace the
        // old one and the old one is removed.

        // How the LinkedList works
        // The LinkedList stores its items in "containers." The list has a link to the
        // first container and each container has a link to the next container in the
        // list.
        // To add an element to the list, the element is placed into a new container and
        // that container is linked to one of the other containers in the list.

        // When To Use
        // ArrayList -> You want to access random items frequently. You only need to add
        // or remove elements at the end of the list
        // LinkedList ->You only use the list by looping through it instead of accessing
        // random items. You frequently need to add and remove items from the begining
        // or middle of the list
    }

    public static void learnHashMap() {
        // ----- HashMap
        // In the ArrayList chapter, you learned that Arrays store items as an ordered
        // collection, and you have to access them with an index number.
        // A HashMap however, store items in "key/value" pairs, and you can access them
        // by an index of another type

        HashMap<String, String> capitalCities = new HashMap<String, String>();
        capitalCities.put("Thailand", "Siam");
        capitalCities.put("Thailand", "Bangkok"); // key name "Thailand" was update value to "Bangkok"
        capitalCities.put("England", "London");
        capitalCities.put("Spain", "Madrid");
        capitalCities.put("Italy", "Milan");

        // --- Access an Item
        System.out.println(capitalCities.get("Thailand"));

        // --- Remove an Item
        capitalCities.remove("Thailand");
        System.out.println(capitalCities.get("Thailand")); // Output is null

        // --- Remove all items
        // capitalCities.clear();

        // --- HashMap Size
        System.out.println(capitalCities.size());

        // --- Loop Through a HashMap
        // -- Print keys
        for (String key : capitalCities.keySet()) {
            System.out.println(key);
        }

        // -- Print value
        for (String value : capitalCities.values()) {
            System.out.println(value);
        }

        // -- Print keys and values
        for (String key : capitalCities.keySet()) {
            System.out.println(key + ": " + capitalCities.get(key));
        }

        // --- Other Types
        HashMap<Integer, String> person = new HashMap<Integer, String>();
        person.put(1, "Chondan");
        person.put(2, "Gerrard");
        person.put(3, "Torres");

        for (Integer key : person.keySet()) {
            System.out.println(key + ": " + person.get(key));
        }
    }

    public static void learnHashSet() {
        // ----- HashSet
        // A HashSet is a collection of items where every item is unique.
        HashSet<String> player = new HashSet<String>();
        player.add("Alisson Becker");
        player.add("Virgil Van Dijk");
        player.add("Mohamed Salah");
        player.add("Messi");

        System.out.println(player);

        // --- Check If an Item Exists
        boolean IsSalahPlayer;
        IsSalahPlayer = player.contains("Mohamed Salah");
        if (IsSalahPlayer) {
            System.out.println("Mohamed Salah is a player");
        }

        // --- Remove an Item
        player.remove("Messi");
        System.out.println(player);

        // --- Remove all items
        // player.clear();
        // System.out.println(player);

        // --- HashSet Size
        System.out.println(player.size());

        // --- Loop Through HashSet
        for (String name : player) {
            System.out.println(name);
        }

        // --- Other Types
        HashSet<Car> garage = new HashSet<Car>();
        Car honda = new Car("Honda", "Civic", "Japan");
        Car toyota = new Car("Toyota", "Camry", "Japan");
        Car ford = new Car("Ford", "Mustang", "USA");
        garage.add(toyota);
        garage.add(honda);
        garage.add(ford);

        for (Car car : garage) {
            car.greeting();
        }

        // --- Get data
        Car car1 = getCarFromGarageHashSet(garage, 0);
        car1.greeting();
    }

    public static Car getCarFromGarageHashSet(HashSet<Car> garage, int index) {
        int check = 0;
        Car returnCar = null;
        for (Car car : garage) {
            if (check == index) {
                returnCar = car;
                break;
            }
            check++;
        }
        return returnCar;
    }

    public static void learnIterator() {
        // ----- Iterator
        // An Iterator is an object that can be used to loop through collections, like
        // ArrayList and HashSet
        // It is called an "iterator" because "iterating" is the technical term for
        // looping

        // --- Getting an Iterator
        // The iterator() method can be used to get an Iterator for any collection
        HashSet<Car> garage = new HashSet<Car>();
        Car honda = new Car("Honda", "Civic", "Japan");
        Car toyota = new Car("Toyota", "Camry", "Japan");
        Car ford = new Car("Ford", "Mustang", "USA");
        garage.add(toyota);
        garage.add(honda);
        garage.add(ford);

        Iterator<Car> it = garage.iterator();
        // Get the first item by using next() method
        it.next().greeting();
        // Get the next item
        it.next().greeting();
        // Get the next item
        it.next().greeting();
        try {
            it.next().greeting();
        } catch (Exception e) {
            System.out.println("Out of index");
        }
        System.out.println(it.hasNext());

        // --- Looping Through a Collection
        System.out.println("---------------");
        it = garage.iterator();
        while (it.hasNext()) {
            it.next().greeting();
        }

        // --- Removing Items from a Collection
        LinkedList<Integer> numbers = new LinkedList<Integer>();
        numbers.add(12);
        numbers.add(11);
        numbers.add(227);
        numbers.add(32);

        Iterator<Integer> num = numbers.iterator();
        while (num.hasNext()) {
            if (num.next() % 2 != 0) {
                num.remove();
            }
        }
        System.out.println(numbers);
        // Note: Trying to remove items using a for loop or a for-each loop would not
        // work correctly because the collection is changing size at the same time that
        // the code is trying to loop
    }

    public static void learnWrapperClasses() {
        // -- Java Wrapper Classes
        // Wrapper classes provide a way to use primitive data types (int, boolean,
        // etc..) as objects.
        // Sometimes you must use wrapper classes, for example when working with
        // Collection object, such as ArrayList, where primitive types cannot be used
        // (the list can only store objects)
        int x = 5; // This is not an object
        Integer y = 10; // This is an object
        System.out.println("x: " + x + ", y: " + y);
        // System.out.println(y.max(10, 25)); // Output is 25
    }

    public static void learnException() throws Exception {
        // ----- Exception
        // When executing Java code, different errors can occur: coding errrors mady by
        // the programmer, errors due to wrong input, or other onforeseeable things.
        // When an error occurs, Java will normally stop and generate an error message.
        // The technical term for this is: Java will throw an exception

        // --- try and catch
        int age = Input.inputInterger("age");
        if (age > 18) {
            System.out.println("You can access.");
        } else {
            throw new Exception("You cannot access.");
        }

        try {
            int[] numbers = {1, 3, 5, 7, 9};
            System.out.println(numbers[10]);
        } catch (Exception e) {
            System.out.println("Something went worng!!");
        } finally {
            System.out.println("The 'try catch' is finished");
        }

    }

    public static void main(String[] args) throws Exception {
        // ----- ArrayList
        // LearnArraylist.run();

        // ----- Build my own ArrayList
        // MyArrayList list1 = new MyArrayList();
        // System.out.println("-----------------------");
        // list1.Insert("Chondan");
        // list1.showArray();
        // list1.clear();
        // list1.showArray();
        // list1.Insert("Sadio Mane");
        // list1.showArray();
        // System.out.println("The size of list1 is " + list1.getSize());
        // list1.Insert("Gerrard");
        // System.out.println("The size of list1 is " + list1.getSize());
        // System.out.println(list1.getData(1));

        // list1.Insert("Trent Alexander Arnold");
        // list1.changeData(2, "Mohamed Salah");
        // list1.Insert("Roberto Firmino");
        // System.out.println("The last data is " + list1.getData(list1.getSize() - 1));

        // System.out.println("The size of list 1 is " + list1.getSize());
        // list1.deleteData(1);
        // System.out.println("The size of list 1 is " + list1.getSize());

        // System.out.println(list1.getData(0));
        // System.out.println(list1.getData(1));

        // ----- LinkedList
        // learnLinkedList();

        // ----- HashMap
        // learnHashMap();

        // ----- HashSet
        // learnHashSet();

        // ----- Iterator
        // learnIterator();

        // ----- Wrapper Classes
        // learnWrapperClasses();

        // ---- Exceptions
        learnException();





        
        
        
        
        
        
        
    }
    
}