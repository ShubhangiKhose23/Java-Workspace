import java.util.Scanner;

public class TwoArray {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();
        int[][] array = new int[rows][cols];
        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                array[i][j] = scanner.nextInt();
            }
        }
        System.out.println("The elements of the array are:");
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();

        }

        System.out.print("Enter the row index to access: ");
        int rowIndex = scanner.nextInt();
        System.out.print("Enter the column index to access: ");
        int colIndex = scanner.nextInt();

        if (rowIndex >= 0 && rowIndex < rows && colIndex >= 0 && colIndex < cols) {
            System.out.println("Element at (" + rowIndex + ", " + colIndex + ") is: " + array[rowIndex][colIndex]);
        } else {
            System.out.println("Invalid indices.");
        }
        scanner.close();
    }

}
