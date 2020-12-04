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

        int[][] a = r






    }

}