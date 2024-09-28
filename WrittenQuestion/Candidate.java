
// Q4 Define a class Candidate with the following description
// Members are : RNo of int type, Name of type String, Score of type float, Remarks of type String.
// Member functions :
// AssignRem() to assign Remarks as per the Score obtained by a candidate. Score range are given below:
// Score	Remarks
// >=50	Selected
// <50	Not Selected
// A function ENTER() to allow user to enter values for RNo, Name, Score and call function AssignRem() to assign the remarks.
// A function DISPLAY() to allow user to view the content of all the data members.
import java.util.Scanner;

public class Candidate {
    // Data members
    private int RNo;
    private String Name;
    private float Score;
    private String Remarks;

    // Member function to assign remarks based on the score
    public void AssignRem() {
        if (Score >= 50) {
            Remarks = "Selected";
        } else {
            Remarks = "Not Selected";
        }
    }

    // Function to enter values for RNo, Name, and Score
    public void ENTER() {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Roll Number: ");
        RNo = sc.nextInt();
        sc.nextLine(); // To consume the newline character

        System.out.print("Enter Name: ");
        Name = sc.nextLine();

        System.out.print("Enter Score: ");
        Score = sc.nextFloat();

        // Call AssignRem to assign the appropriate remark based on the score
        AssignRem();
    }

    // Function to display the content of all data members
    public void DISPLAY() {
        System.out.println("Roll Number: " + RNo);
        System.out.println("Name: " + Name);
        System.out.println("Score: " + Score);
        System.out.println("Remarks: " + Remarks);
    }

    // Main function to demonstrate the program
    public static void main(String[] args) {
        Candidate candidate = new Candidate();
        
        // Allow user to enter candidate details
        candidate.ENTER();
        
        // Display candidate details
        candidate.DISPLAY();
    }
}
