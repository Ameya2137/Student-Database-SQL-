//Main.java

//Name: Ameya Tipnis
//PRN: 23070126012
//Dept: SY-AIML-A1

// Importing required classes
import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);  // Scanner for user input
        StudentOperations operations = new StudentOperations();  // Object to perform operations on students
        int choice;

        // Display menu repeatedly until the user chooses to exit
        do {
            // Displaying the menu
            System.out.println("\nMenu:\n1. Add Student\n2. Display Students\n3. Search by PRN\n4. Update Student\n5. Delete Student\n6. Exit");
            System.out.print("Enter your choice: ");
            choice = scan.nextInt();  // Reading user's choice
            scan.nextLine();  // Consuming leftover newline

            // Handling user choice using switch-case
            switch (choice) {
                case 1 -> {
                    // Adding a new student
                    System.out.print("Enter Name: ");
                    String name = scan.nextLine();
                    System.out.print("Enter PRN: ");
                    int prn = scan.nextInt();
                    scan.nextLine();  // Consume newline
                    System.out.print("Enter Branch: ");
                    String branch = scan.nextLine();
                    System.out.print("Enter Batch: ");
                    String batch = scan.nextLine();
                    System.out.print("Enter CGPA: ");
                    float cgpa = scan.nextFloat();

                    // Add student to database
                    operations.addStudent(new Student(name, prn, branch, batch, cgpa));
                }

                case 2 -> 
                    // Display all students
                    operations.displayStudents();

                case 3 -> {
                    // Search for a student by PRN
                    System.out.print("Enter PRN: ");
                    int prn = scan.nextInt();
                    Student s = operations.searchByPRN(prn);
                    if (s != null)
                        s.display();  // If found, display student info
                    else
                        System.out.println("Student not found.");
                }


