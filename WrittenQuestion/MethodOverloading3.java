// Q3 Create a Java program to demonstrate method overloading with two methods having different numbers of parameters

public class MethodOverloading3 {

    // Method with one parameter
    public void display(String name) {
        System.out.println("Name: " + name);
    }

    // Method with two parameters
    public void display(String name, int age) {
        System.out.println("Name: " + name + ", Age: " + age);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Calling the overloaded methods
        obj.display("Rutik");           // Calls the method with one parameter
        obj.display("Rutik", 25);       // Calls the method with two parameters
    }
}
