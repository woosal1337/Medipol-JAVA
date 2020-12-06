import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {
    static Scanner scanner;

    public static void main(String[] args) {
        File inputFile = new File(".//src//inputs.txt");

        try {
            scanner = new Scanner(inputFile);
        } catch (FileNotFoundException e) {
            System.out.println("inputs.txt file not found");
            e.printStackTrace();
        }

        System.out.println("Reading data from the inputs.txt file placed in the src directory(package)");
        int rows, columns;

        rows = scanner.nextInt();
        columns = scanner.nextInt();

        int[][] a = readMatrix(rows, columns);
        rows = scanner.nextInt();
        columns = scanner.nextInt();

        int[][] b = readMatrix(rows, columns);
        rows = scanner.nextInt();
        columns = scanner.nextInt();

        int[][] c = readMatrix(rows, columns);

        System.out.println();
        System.out.println(" ******* Matrix A *******");
        printMatrix(a);

        System.out.println();
        System.out.println(" ******* Matrix B *******");
        printMatrix(b);

        System.out.println();
        System.out.println(" ******* Matrix C *******");
        printMatrix(c);

        System.out.println();
        System.out.println(" ******* Matrix D *******");
        printMatrix(d);
    }


    public static int[][] readMatrix(int rows, int columns) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = scanner.nextInt();
            }
        }
        return result;
    }

    public static int[][] generateMatrix(int rows, int columns) {
        int[][] result = new int[rows][columns];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                result[i][j] = (int) (Math.random() * 100) + 1;
            }
        }
        return result;
    }

    


}