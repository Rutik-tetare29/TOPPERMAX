// Q1 Write a program on to create a class rectangle to find area of a rectangle using function


public class Rectangle {
    // Instance variables
    private int length;
    private int breadth;

    // Method to set the dimensions of the rectangle
    public void setDimensions(int length, int breadth) {
        this.length = length;
        this.breadth = breadth;
    }

    // Method to calculate and return the area of the rectangle
    public int findArea() {
        return length * breadth;
    }

    public static void main(String[] args) {
        // Create an object of Rectangle class
        Rectangle rect = new Rectangle();

        // Set the dimensions of the rectangle
        rect.setDimensions(5, 10);

        // Calculate and print the area
        int area = rect.findArea();
        System.out.println("The area of the rectangle is: " + area);
    }
}
