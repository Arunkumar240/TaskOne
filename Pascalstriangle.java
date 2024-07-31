package task1;

public class Pascalstriangle {

    // Function to generate and print Pascal's Triangle
    public static void printPascalsTriangle(int n) {
        // Allocate space for the triangle
        int[][] triangle = new int[n][n];

        // Iterate through every row
        for (int i = 0; i < n; i++) {
            // Each row starts with 1
            triangle[i][0] = 1;

            // Fill the rest of the row
            for (int j = 1; j <= i; j++) {
                // Each element is the sum of the element above and the element to the left above
                triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
            }
        }

        // Print the triangle
        for (int i = 0; i < n; i++) {
            // Print leading spaces
            for (int j = 0; j < n - i - 1; j++) {
                System.out.print(" *");
            }
            // Print the numbers
            for (int j = 0; j <= i; j++) {
                System.out.print(triangle[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String[] args) {
        int n = 5; // Number of rows in Pascal's Triangle
        printPascalsTriangle(n);
    }
}
