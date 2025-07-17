import java.util.ArrayList;
import java.util.Scanner;

final class StudentOpration1 {
    private ArrayList<String> studentNames = new ArrayList<>();
    private Scanner sc = new Scanner(System.in);

    public void addStudentNames() {
        System.out.print("Enter number of students: ");
        int n = sc.nextInt();
        sc.nextLine();

        System.out.println("Enter student names:");
        for (int i = 0; i < n; i++) {
            System.out.print("Student " + (i + 1) + ": ");
            studentNames.add(sc.nextLine());
        }
        System.out.println("Names added successfully!");
    }

    public void displayStudents(){
        if (studentNames.isEmpty()) {
            System.out.println("No students found.");
            return;
        }
        System.out.println("--- List of Students ---");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.println((i + 1) + ". " + studentNames.get(i));
        }
        System.out.println("------------------------");
    }

    public void removeStudentByName() {
        System.out.println("--- Remove Students ---");
        if (studentNames.isEmpty()) {
            System.out.println("No students to remove.");
            return;
        }
        System.out.print("Enter student name to remove: ");
        String removeName = sc.nextLine();

        if (studentNames.remove(removeName)) {
            System.out.println("------------Removed Student Name '" + removeName + "' Successfully.");
        } else {
            System.out.println("Student '" + removeName + "' not found.");
        }
    }

    public void searchName() {
        if (studentNames.isEmpty()) {
            System.out.println("No students to search.");
            return;
        }
        System.out.print("Enter student name to search: ");
        String searchName = sc.nextLine();

        if (studentNames.contains(searchName)) {
            System.out.println("Student Found: '" + searchName + "'");
        } else {
            System.out.println("Student Not Found: '" + searchName + "'");
        }
        System.out.println("------------------------");
    }

    public void insertNameByIndex() {
        System.out.print("Enter index to insert: ");
        int index = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        if (index >= 0 && index <= studentNames.size()) {
            studentNames.add(index, name);
            System.out.println("Inserted '" + name + "' at index " + index);
        } else {
            System.out.println("Invalid index. Current list size: " + studentNames.size());
        }
        System.out.println("------------------------");
    }

    public static void main(String[] args) {
        StudentOpration1 so = new StudentOpration1();

        so.addStudentNames();
        so.displayStudents();
        so.removeStudentByName();
        so.displayStudents();
        so.searchName();
        so.insertNameByIndex();
        so.displayStudents();

        so.sc.close();
    }
}