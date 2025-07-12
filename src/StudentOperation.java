/*Write a Java program that stores the names of students in a classroom.
Initially, the number of students is not fixed.
You should provide the following features:
	1.	Add a new student name
	2.	Display all student names
	3.	Remove a student by name
	4.	Search for a student by name
*/

import java.util.Scanner;

final class StudentOperation {
    private String[] studentNames;
    private int count = 0;


    public void addStudentNames() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();
        studentNames = new String[n];
        System.out.println("Enter student names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            studentNames[count++] = sc.nextLine();
        }

    }

    public void displayStudents() {
        if (studentNames == null || count == 0) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("List of Students:");
        for (int i = 0; i < count; i++) {
            System.out.println((i + 1) + ". " + studentNames[i]);
        }

    }

    public void removeStudentByName(){
        System.out.println("Remove Student By Name");
        Scanner sc = new Scanner(System.in);
        String removename=sc.nextLine();
        for(int i=0;i<count;i++)
        {
            if(studentNames[i].equals(removename))
            {
                studentNames[i]=null;
                System.out.println("Remove Student Name "+removename+" Successfully....");
            }
        }
    }

    public void searchName()
    {
        System.out.println("Search Student By Name:");
        Scanner sc = new Scanner(System.in);
        String searchname=sc.nextLine();
        for(int i=0;i<count;i++){
            if(studentNames[i]!= null && studentNames[i].equals(searchname))
            {
                System.out.println("Student Found : "+searchname);
            }
            else {
                System.out.println("Student Not Found : "+studentNames[i]);
            }
        }
    }

    public void opration(){
    System.out.println("1.addStudentNames");
    System.out.println("2.displayStudents");
    System.out.println("3.removeStudentByName");
    System.out.println("4.searchName");
        System.out.println("Select Any Option  For Student Opration");

    Scanner sc =new Scanner(System.in);
    int select=sc.nextInt();
    switch (select) {
        case 1:
            addStudentNames();
            break;
        case 2:
            displayStudents();
            break;
        case 3:
            removeStudentByName();
            break;
        case 4:
            searchName();
            return;
        default:
            System.out.println("Please try again.");

    }
        sc.close();
    }
    public static void main(String[] args) {
        StudentOperation op = new StudentOperation();
        op.addStudentNames();
        op.displayStudents();
        op.removeStudentByName();
        op.searchName();
        op.opration();

        System.out.println("Student Name Managment Is Succesfully Done");

    }


}        