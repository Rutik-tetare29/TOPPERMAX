// Q5 Write a program to print the area of two rectangles having sides (4,5) and (5,8) respectively by creating a class named ‘Rectangle’ with a method named ‘Area’ which returns the area and length and breadth passed as parameters to its constructor.Implement a parameterized constructor to initialize an object

public class Rectangle {
    // Data members
    private int length;
    private int breadth;

    // Parameterized constructor to initialize length and breadth
    public Rectangle(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public int Area() {
        return length * breadth;
    }

    // Main method to demonstrate the program
    public static void main(String[] args) {
        // Creating objects for two rectangles with different dimensions
        Rectangle rect1 = new Rectangle(4, 5);
        Rectangle rect2 = new Rectangle(5, 8);

        // Printing the area of both rectangles
        System.out.println("Area of Rectangle 1: " + rect1.Area());
        System.out.println("Area of Rectangle 2: " + rect2.Area());
    }
}
