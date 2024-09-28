// Q2 Write a Java program to demonstrate method overloading with two methods having different data types and a common parameter


public class MethodOverloading {

    // Method with int parameter
    public void display(int number) {
        System.out.println("Integer value: " + number);
    }

    // Method with double parameter
    public void display(double number) {
        System.out.println("Double value: " + number);
    }

    public static void main(String[] args) {
        MethodOverloading obj = new MethodOverloading();

        // Calling the overloaded methods
        obj.display(10);       // Calls the method with int parameter
        obj.display(5.5);      // Calls the method with double parameter
    }
}
