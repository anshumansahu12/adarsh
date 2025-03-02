import java.util.Scanner;

public class MatrixSum2 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        
        double[][] matrix = new double[3][4];
        
        
        System.out.println("Enter 12 numbers for the 3x4 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print("Enter element at position [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextDouble();
            }
        }
        
        
        double sum = 0;
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                sum += matrix[i][j];
            }
        }
        
        System.out.println("Sum of all elements in the matrix: " + sum);
        
       
        scanner.close();
    }
}
