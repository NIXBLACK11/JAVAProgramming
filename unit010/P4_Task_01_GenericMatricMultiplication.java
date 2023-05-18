package unit01;
import java.util.*;

public class P4_Task_01_GenericMatricMultiplication {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

        // Get dimensions of the first matrix
        System.out.print("Enter the number of rows of matrix 1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns of matrix 1: ");
        int cols1 = scanner.nextInt();

        // Get dimensions of the second matrix
        System.out.print("Enter the number of rows of matrix 2: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns of matrix 2: ");
        int cols2 = scanner.nextInt();

        // Check if the matrices can be multiplied
        if (cols1 != rows2) {
            System.out.println("Matrix multiplication cannot be performed.");
            return;
        }

        // Create and populate the first matrix
        System.out.println("Enter elements of matrix 1:");
        Integer[][] matrix1 = new Integer[rows1][cols1];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Create and populate the second matrix
        System.out.println("Enter elements of matrix 2:");
        Integer[][] matrix2 = new Integer[rows2][cols2];
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Perform matrix multiplication
        Integer[][] result = new Integer[rows1][cols2];
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                result[i][j] = 0;
                for (int k = 0; k < cols1; k++) {
                    result[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the result
        System.out.println("Result of matrix multiplication:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(result[i][j] + " ");
            }
            System.out.println();
        }
	}

}
